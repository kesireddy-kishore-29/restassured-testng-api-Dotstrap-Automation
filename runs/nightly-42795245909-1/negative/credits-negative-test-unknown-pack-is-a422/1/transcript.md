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
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-70715fdf-c880-44f4-9733-77e785ee5abd` |
| 2 | `POST /v1/auth/token` | 200 | 31 | `qa-4b17814e-ae78-4463-8df8-e2efb9654f21` |
| 3 | `POST /v1/credits/purchases` | 422 | 17 | `qa-1f8acc31-9c09-4dba-a999-682ef5b6425e` |
| 4 | `DELETE /v1/accounts/me` | 204 | 33 | `qa-20983067-e2e7-4b7a-848d-8a19b673a49a` |
| 5 | `POST /v1/auth/token` | 401 | 20 | `qa-6eb579f4-55ee-428f-923d-c0df10590072` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-70715fdf-c880-44f4-9733-77e785ee5abd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70715fdf-c880-44f4-9733-77e785ee5abd
Content-Type: application/json

--- request body ---
{"handle":"qa-02c1d9cb9cb8","displayName":"QA 02c1d9cb9cb8","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-70715fdf-c880-44f4-9733-77e785ee5abd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 8
Location: /v1/accounts/qa-02c1d9cb9cb8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b22f992a-ecbc-41f6-963d-6d844ec0cb5c","handle":"qa-02c1d9cb9cb8","displayName":"QA 02c1d9cb9cb8","region":"eu","role":"user","createdAt":"2026-11-10T09:59:47.838398563Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-4b17814e-ae78-4463-8df8-e2efb9654f21

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b17814e-ae78-4463-8df8-e2efb9654f21
Content-Type: application/json

--- request body ---
{"handle":"qa-02c1d9cb9cb8","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b17814e-ae78-4463-8df8-e2efb9654f21
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b22f992a-ecbc-41f6-963d-6d844ec0cb5c"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-1f8acc31-9c09-4dba-a999-682ef5b6425e

--- request headers ---
Accept: application/json
Idempotency-Key: qa-63fe0b159c4043f6ba598fa241883789
X-Correlation-Id: qa-1f8acc31-9c09-4dba-a999-682ef5b6425e
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 17 ms ---
Date: Tue, 10 Nov 2026 09:59:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f8acc31-9c09-4dba-a999-682ef5b6425e
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-1f8acc31-9c09-4dba-a999-682ef5b6425e","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-20983067-e2e7-4b7a-848d-8a19b673a49a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-20983067-e2e7-4b7a-848d-8a19b673a49a
Content-Type: application/json

--- response: 204 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: text/plain
X-Correlation-Id: qa-20983067-e2e7-4b7a-848d-8a19b673a49a
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
correlation: qa-6eb579f4-55ee-428f-923d-c0df10590072

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6eb579f4-55ee-428f-923d-c0df10590072
Content-Type: application/json

--- request body ---
{"handle":"qa-02c1d9cb9cb8","password":"****"}

--- response: 401 in 20 ms ---
Date: Tue, 10 Nov 2026 09:59:48 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6eb579f4-55ee-428f-923d-c0df10590072
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6eb579f4-55ee-428f-923d-c0df10590072"}
```
