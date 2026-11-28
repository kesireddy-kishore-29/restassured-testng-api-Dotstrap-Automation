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
| 1 | `POST /v1/accounts` | 201 | 12 | `qa-18d03823-9e28-4f9f-ba3e-0cfe17832a2c` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-504cbb4a-85cf-4f27-a564-d179a9263cbb` |
| 3 | `POST /v1/credits/purchases` | 422 | 16 | `qa-a9b077f2-e18c-4435-8bcd-ed23d347d8fa` |
| 4 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-407eae44-14f1-401b-b29e-4274931d67cc` |
| 5 | `POST /v1/auth/token` | 401 | 4 | `qa-f05423ae-722b-4be1-be60-807934c716da` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18d03823-9e28-4f9f-ba3e-0cfe17832a2c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18d03823-9e28-4f9f-ba3e-0cfe17832a2c
Content-Type: application/json

--- request body ---
{"handle":"qa-12eef4017f5c","displayName":"QA 12eef4017f5c","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-18d03823-9e28-4f9f-ba3e-0cfe17832a2c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-12eef4017f5c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_136d1729-3636-47de-a64f-1bc401ad9b8b","handle":"qa-12eef4017f5c","displayName":"QA 12eef4017f5c","region":"eu","role":"user","createdAt":"2026-11-23T10:54:53.644624014Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-504cbb4a-85cf-4f27-a564-d179a9263cbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-504cbb4a-85cf-4f27-a564-d179a9263cbb
Content-Type: application/json

--- request body ---
{"handle":"qa-12eef4017f5c","password":"****"}

--- response: 200 in 18 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-504cbb4a-85cf-4f27-a564-d179a9263cbb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_136d1729-3636-47de-a64f-1bc401ad9b8b"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-a9b077f2-e18c-4435-8bcd-ed23d347d8fa

--- request headers ---
Accept: application/json
Idempotency-Key: qa-794b2d7d601c4bda988ce42ef8491891
X-Correlation-Id: qa-a9b077f2-e18c-4435-8bcd-ed23d347d8fa
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 16 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9b077f2-e18c-4435-8bcd-ed23d347d8fa
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-a9b077f2-e18c-4435-8bcd-ed23d347d8fa","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-407eae44-14f1-401b-b29e-4274931d67cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-407eae44-14f1-401b-b29e-4274931d67cc
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-407eae44-14f1-401b-b29e-4274931d67cc
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
correlation: qa-f05423ae-722b-4be1-be60-807934c716da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f05423ae-722b-4be1-be60-807934c716da
Content-Type: application/json

--- request body ---
{"handle":"qa-12eef4017f5c","password":"****"}

--- response: 401 in 4 ms ---
Date: Mon, 23 Nov 2026 10:54:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f05423ae-722b-4be1-be60-807934c716da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f05423ae-722b-4be1-be60-807934c716da"}
```
