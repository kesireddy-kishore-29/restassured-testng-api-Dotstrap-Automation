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
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-14436e7c-78bd-456f-a2cb-3764667a83b7` |
| 2 | `POST /v1/auth/token` | 200 | 34 | `qa-6231dbd6-b332-44f4-8871-99ce829dcc5a` |
| 3 | `POST /v1/credits/purchases` | 422 | 14 | `qa-9bc31676-0610-469a-8522-c4b12f2c69f8` |
| 4 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-02f7a799-2a76-4f03-8831-4e239705fcda` |
| 5 | `POST /v1/auth/token` | 401 | 14 | `qa-ec4bcbd5-dbaf-422a-ba76-26ae3585216b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-14436e7c-78bd-456f-a2cb-3764667a83b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-14436e7c-78bd-456f-a2cb-3764667a83b7
Content-Type: application/json

--- request body ---
{"handle":"qa-6e47c2fce69f","displayName":"QA 6e47c2fce69f","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-14436e7c-78bd-456f-a2cb-3764667a83b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Location: /v1/accounts/qa-6e47c2fce69f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8fbe8b95-5996-4e35-b166-ae5255abe2e0","handle":"qa-6e47c2fce69f","displayName":"QA 6e47c2fce69f","region":"eu","role":"user","createdAt":"2026-10-31T08:31:37.516051650Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-6231dbd6-b332-44f4-8871-99ce829dcc5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6231dbd6-b332-44f4-8871-99ce829dcc5a
Content-Type: application/json

--- request body ---
{"handle":"qa-6e47c2fce69f","password":"****"}

--- response: 200 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-6231dbd6-b332-44f4-8871-99ce829dcc5a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8fbe8b95-5996-4e35-b166-ae5255abe2e0"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-9bc31676-0610-469a-8522-c4b12f2c69f8

--- request headers ---
Accept: application/json
Idempotency-Key: qa-e3b3ac4c39a14bbda2b4e136e85a8734
X-Correlation-Id: qa-9bc31676-0610-469a-8522-c4b12f2c69f8
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9bc31676-0610-469a-8522-c4b12f2c69f8
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-9bc31676-0610-469a-8522-c4b12f2c69f8","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02f7a799-2a76-4f03-8831-4e239705fcda

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02f7a799-2a76-4f03-8831-4e239705fcda
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02f7a799-2a76-4f03-8831-4e239705fcda
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
correlation: qa-ec4bcbd5-dbaf-422a-ba76-26ae3585216b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec4bcbd5-dbaf-422a-ba76-26ae3585216b
Content-Type: application/json

--- request body ---
{"handle":"qa-6e47c2fce69f","password":"****"}

--- response: 401 in 14 ms ---
Date: Sat, 31 Oct 2026 08:31:37 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ec4bcbd5-dbaf-422a-ba76-26ae3585216b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ec4bcbd5-dbaf-422a-ba76-26ae3585216b"}
```
