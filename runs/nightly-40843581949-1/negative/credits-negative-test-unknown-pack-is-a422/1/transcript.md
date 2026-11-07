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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-18adb6de-04b8-4f42-b224-c7e44ad92c5f` |
| 2 | `POST /v1/auth/token` | 200 | 29 | `qa-deb78883-8ab3-44cf-a044-ffee7f6c4b51` |
| 3 | `POST /v1/credits/purchases` | 422 | 15 | `qa-053d0145-85f8-48f0-a505-bb20c9025402` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-412a3249-ed65-47a0-b932-90d5d8ede776` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-126f75c3-8c63-4385-a7b0-e4e096cd9b31` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-18adb6de-04b8-4f42-b224-c7e44ad92c5f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18adb6de-04b8-4f42-b224-c7e44ad92c5f
Content-Type: application/json

--- request body ---
{"handle":"qa-40f675ca018b","displayName":"QA 40f675ca018b","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-18adb6de-04b8-4f42-b224-c7e44ad92c5f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Location: /v1/accounts/qa-40f675ca018b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_683910b5-f35e-49fb-92cb-47d513770b15","handle":"qa-40f675ca018b","displayName":"QA 40f675ca018b","region":"eu","role":"user","createdAt":"2026-10-29T08:38:51.653565418Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-deb78883-8ab3-44cf-a044-ffee7f6c4b51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-deb78883-8ab3-44cf-a044-ffee7f6c4b51
Content-Type: application/json

--- request body ---
{"handle":"qa-40f675ca018b","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-deb78883-8ab3-44cf-a044-ffee7f6c4b51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_683910b5-f35e-49fb-92cb-47d513770b15"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-053d0145-85f8-48f0-a505-bb20c9025402

--- request headers ---
Accept: application/json
Idempotency-Key: qa-f6bcd040d5e24db79d7840860be12f9e
X-Correlation-Id: qa-053d0145-85f8-48f0-a505-bb20c9025402
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 15 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-053d0145-85f8-48f0-a505-bb20c9025402
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-053d0145-85f8-48f0-a505-bb20c9025402","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-412a3249-ed65-47a0-b932-90d5d8ede776

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-412a3249-ed65-47a0-b932-90d5d8ede776
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-412a3249-ed65-47a0-b932-90d5d8ede776
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
correlation: qa-126f75c3-8c63-4385-a7b0-e4e096cd9b31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-126f75c3-8c63-4385-a7b0-e4e096cd9b31
Content-Type: application/json

--- request body ---
{"handle":"qa-40f675ca018b","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 29 Oct 2026 08:38:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-126f75c3-8c63-4385-a7b0-e4e096cd9b31
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-126f75c3-8c63-4385-a7b0-e4e096cd9b31"}
```
