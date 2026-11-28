# Transcript: Keys are scoped per account

| | |
|---|---|
| Test | `com.qaautomation.tests.resilience.IdempotencyTest#theSameKeyFromTwoAccountsMakesTwoPurchases` |
| Features | FEAT-IDEMP-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 483 | `qa-a2cef5e6-5307-4655-af57-fd816101ba78` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-7eb8a004-cf7b-49e0-9504-3955e7bb009b` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-562f9975-3854-4b5a-b4f1-85caacf2cac8` |
| 4 | `POST /v1/credits/purchases` | 201 | 55 | `qa-ceeb4c64-dc4e-4e52-bc8d-fd70b92b4e5f` |
| 5 | `POST /v1/auth/token` | 200 | 25 | `qa-58e1e88b-1603-4ec2-9e0a-022aa007dbfe` |
| 6 | `POST /v1/credits/purchases` | 201 | 12 | `qa-030bdfca-cb2c-49e3-90d4-bf2111631756` |
| 7 | `DELETE /v1/accounts/me` | 204 | 46 | `qa-2fce98b6-c3c5-403d-93a1-ee6620d80ade` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-1adde731-fa09-4146-a569-8f5e92ac3b62` |
| 9 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-e72f00af-583d-4f30-8d1e-3241cca82b30` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-424a1759-6850-431a-86e3-6a97835b3fcb` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a2cef5e6-5307-4655-af57-fd816101ba78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2cef5e6-5307-4655-af57-fd816101ba78
Content-Type: application/json

--- request body ---
{"handle":"qa-8127cae51f93","displayName":"QA 8127cae51f93","password":"****","region":"eu"}

--- response: 201 in 483 ms ---
Date: Mon, 23 Nov 2026 10:55:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2cef5e6-5307-4655-af57-fd816101ba78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-8127cae51f93
X-Served-Region: eu
Content-Length: 181

{"id":"acc_978477dd-3457-4fa5-8812-93917a3d04a9","handle":"qa-8127cae51f93","displayName":"QA 8127cae51f93","region":"eu","role":"user","createdAt":"2026-11-23T10:55:01.678088136Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7eb8a004-cf7b-49e0-9504-3955e7bb009b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7eb8a004-cf7b-49e0-9504-3955e7bb009b
Content-Type: application/json

--- request body ---
{"handle":"qa-44a57be160ed","displayName":"QA 44a57be160ed","password":"****","region":"us"}

--- response: 201 in 33 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-7eb8a004-cf7b-49e0-9504-3955e7bb009b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-44a57be160ed
X-Served-Region: us
Content-Length: 181

{"id":"acc_1959a45a-0902-4252-86bc-d5d1bc014e23","handle":"qa-44a57be160ed","displayName":"QA 44a57be160ed","region":"us","role":"user","createdAt":"2026-11-23T10:55:02.100007963Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-562f9975-3854-4b5a-b4f1-85caacf2cac8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-562f9975-3854-4b5a-b4f1-85caacf2cac8
Content-Type: application/json

--- request body ---
{"handle":"qa-8127cae51f93","password":"****"}

--- response: 200 in 32 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-562f9975-3854-4b5a-b4f1-85caacf2cac8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_978477dd-3457-4fa5-8812-93917a3d04a9"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ceeb4c64-dc4e-4e52-bc8d-fd70b92b4e5f

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d5982bc962f24fcb8dc6bec8c355bd8b
X-Correlation-Id: qa-ceeb4c64-dc4e-4e52-bc8d-fd70b92b4e5f
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 55 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ceeb4c64-dc4e-4e52-bc8d-fd70b92b4e5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/credits/purchases/pur_4fc55fe3-ac4c-483c-8836-b558dc0ad86d
Content-Length: 144

{"id":"pur_4fc55fe3-ac4c-483c-8836-b558dc0ad86d","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.268134142Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-58e1e88b-1603-4ec2-9e0a-022aa007dbfe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58e1e88b-1603-4ec2-9e0a-022aa007dbfe
Content-Type: application/json

--- request body ---
{"handle":"qa-44a57be160ed","password":"****"}

--- response: 200 in 25 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-58e1e88b-1603-4ec2-9e0a-022aa007dbfe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1959a45a-0902-4252-86bc-d5d1bc014e23"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-030bdfca-cb2c-49e3-90d4-bf2111631756

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d5982bc962f24fcb8dc6bec8c355bd8b
X-Correlation-Id: qa-030bdfca-cb2c-49e3-90d4-bf2111631756
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-030bdfca-cb2c-49e3-90d4-bf2111631756
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: us
Location: /v1/credits/purchases/pur_2db395e4-1cc7-4393-9ea6-7c2f6c7e08af
Content-Length: 144

{"id":"pur_2db395e4-1cc7-4393-9ea6-7c2f6c7e08af","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-23T10:55:02.378333165Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2fce98b6-c3c5-403d-93a1-ee6620d80ade

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fce98b6-c3c5-403d-93a1-ee6620d80ade
Content-Type: application/json

--- response: 204 in 46 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2fce98b6-c3c5-403d-93a1-ee6620d80ade
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: us
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-1adde731-fa09-4146-a569-8f5e92ac3b62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1adde731-fa09-4146-a569-8f5e92ac3b62
Content-Type: application/json

--- request body ---
{"handle":"qa-44a57be160ed","password":"****"}

--- response: 401 in 16 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1adde731-fa09-4146-a569-8f5e92ac3b62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1adde731-fa09-4146-a569-8f5e92ac3b62"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e72f00af-583d-4f30-8d1e-3241cca82b30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e72f00af-583d-4f30-8d1e-3241cca82b30
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e72f00af-583d-4f30-8d1e-3241cca82b30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-424a1759-6850-431a-86e3-6a97835b3fcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-424a1759-6850-431a-86e3-6a97835b3fcb
Content-Type: application/json

--- request body ---
{"handle":"qa-8127cae51f93","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 23 Nov 2026 10:55:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-424a1759-6850-431a-86e3-6a97835b3fcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-424a1759-6850-431a-86e3-6a97835b3fcb"}
```
