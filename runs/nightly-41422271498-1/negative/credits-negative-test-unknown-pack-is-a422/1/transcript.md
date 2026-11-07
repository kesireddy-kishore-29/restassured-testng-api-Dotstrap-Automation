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
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-45d5d00d-550a-4c40-8f3a-53317da3dd1c` |
| 2 | `POST /v1/auth/token` | 200 | 26 | `qa-360186d9-64bc-4662-af28-237deff37662` |
| 3 | `POST /v1/credits/purchases` | 422 | 23 | `qa-26da89da-bfd9-444d-9eb6-5c80e8d95c15` |
| 4 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-ee145644-1538-42a1-9d6c-e8b6c9a36e7f` |
| 5 | `POST /v1/auth/token` | 401 | 12 | `qa-6c1381fa-28e9-4f53-9a64-3fae47005351` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-45d5d00d-550a-4c40-8f3a-53317da3dd1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45d5d00d-550a-4c40-8f3a-53317da3dd1c
Content-Type: application/json

--- request body ---
{"handle":"qa-c70b6ebe093c","displayName":"QA c70b6ebe093c","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-45d5d00d-550a-4c40-8f3a-53317da3dd1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 8
Location: /v1/accounts/qa-c70b6ebe093c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b06f5199-88b3-481c-9599-7b05483dfb01","handle":"qa-c70b6ebe093c","displayName":"QA c70b6ebe093c","region":"eu","role":"user","createdAt":"2026-11-02T09:38:43.206493859Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-360186d9-64bc-4662-af28-237deff37662

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-360186d9-64bc-4662-af28-237deff37662
Content-Type: application/json

--- request body ---
{"handle":"qa-c70b6ebe093c","password":"****"}

--- response: 200 in 26 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-360186d9-64bc-4662-af28-237deff37662
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b06f5199-88b3-481c-9599-7b05483dfb01"}
```

## 3. POST /v1/credits/purchases

```text
#3 POST http://localhost:7070/v1/credits/purchases
correlation: qa-26da89da-bfd9-444d-9eb6-5c80e8d95c15

--- request headers ---
Accept: application/json
Idempotency-Key: qa-a9f8560a9805479d8483b6fe220f572f
X-Correlation-Id: qa-26da89da-bfd9-444d-9eb6-5c80e8d95c15
Content-Type: application/json

--- request body ---
{"packId":"pack-9000"}

--- response: 422 in 23 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26da89da-bfd9-444d-9eb6-5c80e8d95c15
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/credits/purchases","correlationId":"qa-26da89da-bfd9-444d-9eb6-5c80e8d95c15","errors":[{"field":"packId","message":"one of: pack-10, pack-50"}]}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ee145644-1538-42a1-9d6c-e8b6c9a36e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee145644-1538-42a1-9d6c-e8b6c9a36e7f
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ee145644-1538-42a1-9d6c-e8b6c9a36e7f
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
correlation: qa-6c1381fa-28e9-4f53-9a64-3fae47005351

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c1381fa-28e9-4f53-9a64-3fae47005351
Content-Type: application/json

--- request body ---
{"handle":"qa-c70b6ebe093c","password":"****"}

--- response: 401 in 12 ms ---
Date: Mon, 02 Nov 2026 09:38:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c1381fa-28e9-4f53-9a64-3fae47005351
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6c1381fa-28e9-4f53-9a64-3fae47005351"}
```
