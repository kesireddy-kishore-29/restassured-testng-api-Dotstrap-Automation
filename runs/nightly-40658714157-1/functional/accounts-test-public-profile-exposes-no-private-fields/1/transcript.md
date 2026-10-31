# Transcript: Anyone signed in sees a public profile with no private fields

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.AccountsTest#publicProfileExposesNoPrivateFields` |
| Features | FEAT-ACCT-03 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 336 | `qa-ce10a08c-b00b-4e35-aa34-4fe58a9cab79` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-d6b5756c-c453-409b-baab-abdcbf291d3f` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-8d1a6f5d-f5ad-48fd-b4eb-3102499c7fd8` |
| 4 | `GET /v1/accounts/{handle}` | 200 | 31 | `qa-249a41c7-fd9b-452f-a07a-5f75c44a3023` |
| 5 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-57ccd924-457c-40b6-b7ed-30d0bf1930d2` |
| 6 | `GET /v1/accounts/{handle}` | 200 | 13 | `qa-f1b987ac-00bc-4da5-91da-16b7995d694a` |
| 7 | `POST /v1/auth/token` | 200 | 22 | `qa-3bd4f444-b8d9-4e8a-91d1-ee20d89f648f` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-93cf1129-1f25-4f5c-8b86-925abb20129f` |
| 9 | `POST /v1/auth/token` | 401 | 11 | `qa-35eea20c-f5a8-46e3-8933-f2e07735d02e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-675f6b4a-66f5-46c7-89b7-04cd6b72bf29` |
| 11 | `POST /v1/auth/token` | 401 | 8 | `qa-b816c88f-a6a4-4f1e-be2e-6cb6f49d0f37` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ce10a08c-b00b-4e35-aa34-4fe58a9cab79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce10a08c-b00b-4e35-aa34-4fe58a9cab79
Content-Type: application/json

--- request body ---
{"handle":"qa-395ea2704990","displayName":"QA 395ea2704990","password":"****","region":"eu"}

--- response: 201 in 336 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce10a08c-b00b-4e35-aa34-4fe58a9cab79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-395ea2704990
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a3b313d8-5816-411f-b01d-feb7f8a9deef","handle":"qa-395ea2704990","displayName":"QA 395ea2704990","region":"eu","role":"user","createdAt":"2026-10-28T08:42:52.330464007Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d6b5756c-c453-409b-baab-abdcbf291d3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6b5756c-c453-409b-baab-abdcbf291d3f
Content-Type: application/json

--- request body ---
{"handle":"qa-a46c57b14d34","displayName":"QA a46c57b14d34","password":"****","region":"us"}

--- response: 201 in 26 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6b5756c-c453-409b-baab-abdcbf291d3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Location: /v1/accounts/qa-a46c57b14d34
X-Served-Region: us
Content-Length: 181

{"id":"acc_a62faf3c-5720-46a9-a988-6f8b9c2f353c","handle":"qa-a46c57b14d34","displayName":"QA a46c57b14d34","region":"us","role":"user","createdAt":"2026-10-28T08:42:52.647123392Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8d1a6f5d-f5ad-48fd-b4eb-3102499c7fd8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d1a6f5d-f5ad-48fd-b4eb-3102499c7fd8
Content-Type: application/json

--- request body ---
{"handle":"qa-395ea2704990","password":"****"}

--- response: 200 in 16 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d1a6f5d-f5ad-48fd-b4eb-3102499c7fd8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a3b313d8-5816-411f-b01d-feb7f8a9deef"}
```

## 4. GET /v1/accounts/{handle}

```text
#4 GET http://localhost:7070/v1/accounts/qa-a46c57b14d34
correlation: qa-249a41c7-fd9b-452f-a07a-5f75c44a3023

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-249a41c7-fd9b-452f-a07a-5f75c44a3023
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-249a41c7-fd9b-452f-a07a-5f75c44a3023
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
Content-Length: 74

{"handle":"qa-a46c57b14d34","displayName":"QA a46c57b14d34","region":"us"}
```

## 5. GET /v1/accounts/{handle}

```text
#5 GET http://localhost:7070/v1/accounts/qa-a46c57b14d34
correlation: qa-57ccd924-457c-40b6-b7ed-30d0bf1930d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57ccd924-457c-40b6-b7ed-30d0bf1930d2
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-57ccd924-457c-40b6-b7ed-30d0bf1930d2
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
Content-Length: 74

{"handle":"qa-a46c57b14d34","displayName":"QA a46c57b14d34","region":"us"}
```

## 6. GET /v1/accounts/{handle}

```text
#6 GET http://localhost:7070/v1/accounts/qa-a46c57b14d34
correlation: qa-f1b987ac-00bc-4da5-91da-16b7995d694a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1b987ac-00bc-4da5-91da-16b7995d694a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f1b987ac-00bc-4da5-91da-16b7995d694a
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
Content-Length: 74

{"handle":"qa-a46c57b14d34","displayName":"QA a46c57b14d34","region":"us"}
```

## 7. POST /v1/auth/token

```text
#7 POST http://localhost:7070/v1/auth/token
correlation: qa-3bd4f444-b8d9-4e8a-91d1-ee20d89f648f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bd4f444-b8d9-4e8a-91d1-ee20d89f648f
Content-Type: application/json

--- request body ---
{"handle":"qa-a46c57b14d34","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bd4f444-b8d9-4e8a-91d1-ee20d89f648f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a62faf3c-5720-46a9-a988-6f8b9c2f353c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-93cf1129-1f25-4f5c-8b86-925abb20129f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93cf1129-1f25-4f5c-8b86-925abb20129f
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-93cf1129-1f25-4f5c-8b86-925abb20129f
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
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-35eea20c-f5a8-46e3-8933-f2e07735d02e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35eea20c-f5a8-46e3-8933-f2e07735d02e
Content-Type: application/json

--- request body ---
{"handle":"qa-a46c57b14d34","password":"****"}

--- response: 401 in 11 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35eea20c-f5a8-46e3-8933-f2e07735d02e
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-35eea20c-f5a8-46e3-8933-f2e07735d02e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-675f6b4a-66f5-46c7-89b7-04cd6b72bf29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-675f6b4a-66f5-46c7-89b7-04cd6b72bf29
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: text/plain
X-Correlation-Id: qa-675f6b4a-66f5-46c7-89b7-04cd6b72bf29
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-b816c88f-a6a4-4f1e-be2e-6cb6f49d0f37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b816c88f-a6a4-4f1e-be2e-6cb6f49d0f37
Content-Type: application/json

--- request body ---
{"handle":"qa-395ea2704990","password":"****"}

--- response: 401 in 8 ms ---
Date: Wed, 28 Oct 2026 08:42:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b816c88f-a6a4-4f1e-be2e-6cb6f49d0f37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b816c88f-a6a4-4f1e-be2e-6cb6f49d0f37"}
```
