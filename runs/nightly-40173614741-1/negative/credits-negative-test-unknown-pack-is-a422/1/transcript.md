# Transcript: An unknown credit pack is a 422 on packId

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#unknownPackIsA422` |
| Features | FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-4958a268-f5d7-448f-ac98-2ffd0e5ad364` |
| 2 | `POST /v1/auth/token` | 200 | 28 | `qa-97c486a3-2b26-42e5-a63b-0b271ee63581` |
| 3 | `POST /v1/credits/purchases` | 422 | 20 | `qa-8489ebae-74bf-4cff-ae75-7ff4e242f6d7` |
| 4 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-868dae1c-f159-4613-a609-5c95db13714d` |
| 5 | `POST /v1/auth/token` | 401 | 9 | `qa-b8e443e7-d6ad-4bbd-b33f-0cd30102008e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4958a268-f5d7-448f-ac98-2ffd0e5ad364

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4958a268-f5d7-448f-ac98-2ffd0e5ad364
Content-Type: application/json

--- request body ---
{"handle":"qa-307ef2deff35","displayName":"QA 307ef2deff35","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-4958a268-f5d7-448f-ac98-2ffd0e5ad364
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Location: /v1/accounts/qa-307ef2deff35
X-Served-Region: eu
Content-Length: 181

{"id":"acc_48db2f24-07b1-4372-a604-9195a3acf3e0","handle":"qa-307ef2deff35","displayName":"QA 307ef2deff35","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.094977448Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-97c486a3-2b26-42e5-a63b-0b271ee63581

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-97c486a3-2b26-42e5-a63b-0b271ee63581
Content-Type: application/json

--- request body ---
{"handle":"qa-307ef2deff35","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-97c486a3-2b26-42e5-a63b-0b271ee63581
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_48db2f24-07b1-4372-a604-9195a3acf3e0"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-8489ebae-74bf-4cff-ae75-7ff4e242f6d7

--- request headers ---
Accept: application/json
Idempotency-Key: qa-ef27e130cd6d4d9bad079d2ed4bfe013
X-Correlation-Id: qa-8489ebae-74bf-4cff-ae75-7ff4e242f6d7
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 20 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8489ebae-74bf-4cff-ae75-7ff4e242f6d7
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-8489ebae-74bf-4cff-ae75-7ff4e242f6d7","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-868dae1c-f159-4613-a609-5c95db13714d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-868dae1c-f159-4613-a609-5c95db13714d
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: text/plain
X-Correlation-Id: qa-868dae1c-f159-4613-a609-5c95db13714d
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-b8e443e7-d6ad-4bbd-b33f-0cd30102008e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8e443e7-d6ad-4bbd-b33f-0cd30102008e
Content-Type: application/json

--- request body ---
{"handle":"qa-307ef2deff35","password":"****"}

--- response: 401 in 9 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b8e443e7-d6ad-4bbd-b33f-0cd30102008e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b8e443e7-d6ad-4bbd-b33f-0cd30102008e"}
```
