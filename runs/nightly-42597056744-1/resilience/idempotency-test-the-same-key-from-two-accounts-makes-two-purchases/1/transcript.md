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
| 1 | `POST /v1/accounts` | 201 | 560 | `qa-6bc564db-6917-4dc1-8efb-e0f1944dacb6` |
| 2 | `POST /v1/accounts` | 201 | 68 | `qa-c7f725c2-0786-4375-82e1-d706dad3c761` |
| 3 | `POST /v1/auth/token` | 200 | 14 | `qa-ec14db5e-2382-43b7-b69e-bb32d13ae39d` |
| 4 | `POST /v1/credits/purchases` | 201 | 94 | `qa-ff50db03-a800-4525-a935-34524fb890fc` |
| 5 | `POST /v1/auth/token` | 200 | 28 | `qa-a726fcb7-5f06-4f94-9556-e096d053284e` |
| 6 | `POST /v1/credits/purchases` | 201 | 19 | `qa-1ccae5d6-bec0-4d02-9c21-11d318a2fe5d` |
| 7 | `DELETE /v1/accounts/me` | 204 | 50 | `qa-9df60df8-bb11-4cac-a1bf-3144232c877b` |
| 8 | `POST /v1/auth/token` | 401 | 18 | `qa-ad7a517f-71f9-4bf5-b50d-50b4c5bee37a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-b848a5ba-b17c-4fba-8890-7da931f97a9e` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-4f41e732-d4b1-4d8c-a3dc-9e64e3e01e3d` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6bc564db-6917-4dc1-8efb-e0f1944dacb6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6bc564db-6917-4dc1-8efb-e0f1944dacb6
Content-Type: application/json

--- request body ---
{"handle":"qa-a5f6daf5853b","displayName":"QA a5f6daf5853b","password":"****","region":"eu"}

--- response: 201 in 560 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6bc564db-6917-4dc1-8efb-e0f1944dacb6
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
Location: /v1/accounts/qa-a5f6daf5853b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a8a9fb70-328a-4005-a953-c2ad11d26189","handle":"qa-a5f6daf5853b","displayName":"QA a5f6daf5853b","region":"eu","role":"user","createdAt":"2026-11-09T09:55:58.408473848Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c7f725c2-0786-4375-82e1-d706dad3c761

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7f725c2-0786-4375-82e1-d706dad3c761
Content-Type: application/json

--- request body ---
{"handle":"qa-c69275d822e6","displayName":"QA c69275d822e6","password":"****","region":"us"}

--- response: 201 in 68 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7f725c2-0786-4375-82e1-d706dad3c761
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
Location: /v1/accounts/qa-c69275d822e6
X-Served-Region: us
Content-Length: 181

{"id":"acc_0807a6aa-c953-4916-a197-6805f8784d99","handle":"qa-c69275d822e6","displayName":"QA c69275d822e6","region":"us","role":"user","createdAt":"2026-11-09T09:55:58.889733726Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ec14db5e-2382-43b7-b69e-bb32d13ae39d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec14db5e-2382-43b7-b69e-bb32d13ae39d
Content-Type: application/json

--- request body ---
{"handle":"qa-a5f6daf5853b","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 09 Nov 2026 09:55:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec14db5e-2382-43b7-b69e-bb32d13ae39d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a8a9fb70-328a-4005-a953-c2ad11d26189"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-ff50db03-a800-4525-a935-34524fb890fc

--- request headers ---
Accept: application/json
Idempotency-Key: qa-58426a11be924c86a638a74599ae05f2
X-Correlation-Id: qa-ff50db03-a800-4525-a935-34524fb890fc
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 94 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff50db03-a800-4525-a935-34524fb890fc
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
Location: /v1/credits/purchases/pur_5c82e86d-0a4c-4a6a-b998-65fbbec1b773
Content-Length: 144

{"id":"pur_5c82e86d-0a4c-4a6a-b998-65fbbec1b773","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.078970530Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-a726fcb7-5f06-4f94-9556-e096d053284e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a726fcb7-5f06-4f94-9556-e096d053284e
Content-Type: application/json

--- request body ---
{"handle":"qa-c69275d822e6","password":"****"}

--- response: 200 in 28 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a726fcb7-5f06-4f94-9556-e096d053284e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0807a6aa-c953-4916-a197-6805f8784d99"}
```

## 6. POST /v1/credits/purchases

```text
#6 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1ccae5d6-bec0-4d02-9c21-11d318a2fe5d

--- request headers ---
Accept: application/json
Idempotency-Key: qa-58426a11be924c86a638a74599ae05f2
X-Correlation-Id: qa-1ccae5d6-bec0-4d02-9c21-11d318a2fe5d
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 19 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ccae5d6-bec0-4d02-9c21-11d318a2fe5d
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
Location: /v1/credits/purchases/pur_1571f9ce-71c3-465e-8ced-5a213d0cd0f5
Content-Length: 144

{"id":"pur_1571f9ce-71c3-465e-8ced-5a213d0cd0f5","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-09T09:55:59.200914359Z"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9df60df8-bb11-4cac-a1bf-3144232c877b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9df60df8-bb11-4cac-a1bf-3144232c877b
Content-Type: application/json

--- response: 204 in 50 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9df60df8-bb11-4cac-a1bf-3144232c877b
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
correlation: qa-ad7a517f-71f9-4bf5-b50d-50b4c5bee37a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad7a517f-71f9-4bf5-b50d-50b4c5bee37a
Content-Type: application/json

--- request body ---
{"handle":"qa-c69275d822e6","password":"****"}

--- response: 401 in 18 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad7a517f-71f9-4bf5-b50d-50b4c5bee37a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad7a517f-71f9-4bf5-b50d-50b4c5bee37a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b848a5ba-b17c-4fba-8890-7da931f97a9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b848a5ba-b17c-4fba-8890-7da931f97a9e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b848a5ba-b17c-4fba-8890-7da931f97a9e
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
correlation: qa-4f41e732-d4b1-4d8c-a3dc-9e64e3e01e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f41e732-d4b1-4d8c-a3dc-9e64e3e01e3d
Content-Type: application/json

--- request body ---
{"handle":"qa-a5f6daf5853b","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 09 Nov 2026 09:55:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4f41e732-d4b1-4d8c-a3dc-9e64e3e01e3d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4f41e732-d4b1-4d8c-a3dc-9e64e3e01e3d"}
```
