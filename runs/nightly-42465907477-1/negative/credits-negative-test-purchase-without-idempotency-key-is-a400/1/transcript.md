# Transcript: A purchase without an Idempotency-Key is refused with 400

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.CreditsNegativeTest#purchaseWithoutIdempotencyKeyIsA400` |
| Features | FEAT-IDEMP-03, FEAT-ERR-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 6 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 16 | `qa-e675e489-9d5b-401a-9059-10e513df523b` |
| 2 | `POST /v1/auth/token` | 200 | 42 | `qa-d5b73404-bc35-4ebc-836b-9493cde85f30` |
| 3 | `POST /v1/credits/purchases` | 400 | 13 | `qa-62f6ffa0-d42f-485c-9468-429347753dd2` |
| 4 | `GET /v1/credits/balance` | 200 | 8 | `qa-a4ed89d8-718d-4a23-be14-560d26466005` |
| 5 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-036ad18c-a851-42b9-a23e-a938269476cb` |
| 6 | `POST /v1/auth/token` | 401 | 4 | `qa-17b1bf43-16c3-414b-82b0-54f69ba90696` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e675e489-9d5b-401a-9059-10e513df523b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e675e489-9d5b-401a-9059-10e513df523b
Content-Type: application/json

--- request body ---
{"handle":"qa-9b16548b5f2b","displayName":"QA 9b16548b5f2b","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e675e489-9d5b-401a-9059-10e513df523b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-9b16548b5f2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e5be074-3892-429e-8d06-77104a91f9ac","handle":"qa-9b16548b5f2b","displayName":"QA 9b16548b5f2b","region":"eu","role":"user","createdAt":"2026-11-08T09:09:06.813357372Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-d5b73404-bc35-4ebc-836b-9493cde85f30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5b73404-bc35-4ebc-836b-9493cde85f30
Content-Type: application/json

--- request body ---
{"handle":"qa-9b16548b5f2b","password":"****"}

--- response: 200 in 42 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5b73404-bc35-4ebc-836b-9493cde85f30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e5be074-3892-429e-8d06-77104a91f9ac"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-62f6ffa0-d42f-485c-9468-429347753dd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62f6ffa0-d42f-485c-9468-429347753dd2
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 400 in 13 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62f6ffa0-d42f-485c-9468-429347753dd2
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
Content-Length: 319

{"type":"https://reference-service.example/problems/idempotency-key-required","title":"Idempotency-Key header required","status":400,"detail":"A purchase must carry an Idempotency-Key header of 8-64 characters [A-Za-z0-9_-].","instance":"/v1/credits/purchases","correlationId":"qa-62f6ffa0-d42f-485c-9468-429347753dd2"}
```

## 4. GET /v1/credits/balance

```text
#4 GET http://localhost:7070/v1/credits/balance
correlation: qa-a4ed89d8-718d-4a23-be14-560d26466005

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4ed89d8-718d-4a23-be14-560d26466005
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4ed89d8-718d-4a23-be14-560d26466005
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
Content-Length: 89

{"balance":5,"currency":"credits","accountId":"acc_5e5be074-3892-429e-8d06-77104a91f9ac"}
```

## 5. DELETE /v1/accounts/me

```text
#5 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-036ad18c-a851-42b9-a23e-a938269476cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-036ad18c-a851-42b9-a23e-a938269476cb
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-036ad18c-a851-42b9-a23e-a938269476cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-17b1bf43-16c3-414b-82b0-54f69ba90696

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17b1bf43-16c3-414b-82b0-54f69ba90696
Content-Type: application/json

--- request body ---
{"handle":"qa-9b16548b5f2b","password":"****"}

--- response: 401 in 4 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-17b1bf43-16c3-414b-82b0-54f69ba90696
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-17b1bf43-16c3-414b-82b0-54f69ba90696"}
```
