# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[0]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 13 | `qa-2c24bd20-9548-4d52-bd08-b9daf6110c3f` |
| 2 | `POST /v1/auth/token` | 200 | 18 | `qa-12e21bd1-b2e6-4978-91d4-81b4c1ddcbb8` |
| 3 | `GET /v1/conversations/{id}` | 404 | 6 | `qa-abe6069f-dc7f-4eb9-9fd6-d8fe3198c465` |
| 4 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-3713da95-ce25-4a6a-870e-fb63b132c0cb` |
| 5 | `POST /v1/auth/token` | 401 | 10 | `qa-48d3b43c-1fd3-4b45-8ff0-7a832d63f3e1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-2c24bd20-9548-4d52-bd08-b9daf6110c3f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c24bd20-9548-4d52-bd08-b9daf6110c3f
Content-Type: application/json

--- request body ---
{"handle":"qa-212a9570bd51","displayName":"QA 212a9570bd51","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c24bd20-9548-4d52-bd08-b9daf6110c3f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 288
RateLimit-Reset: 8
Location: /v1/accounts/qa-212a9570bd51
X-Served-Region: eu
Content-Length: 178

{"id":"acc_dd0ea5f1-4ffd-43ae-a0b6-d5a9e5c04f4c","handle":"qa-212a9570bd51","displayName":"QA 212a9570bd51","region":"eu","role":"user","createdAt":"2026-10-28T08:42:53.600474Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-12e21bd1-b2e6-4978-91d4-81b4c1ddcbb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-12e21bd1-b2e6-4978-91d4-81b4c1ddcbb8
Content-Type: application/json

--- request body ---
{"handle":"qa-212a9570bd51","password":"****"}

--- response: 200 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-12e21bd1-b2e6-4978-91d4-81b4c1ddcbb8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 285
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_dd0ea5f1-4ffd-43ae-a0b6-d5a9e5c04f4c"}
```

## 3. GET /v1/conversations/{id}

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist
correlation: qa-abe6069f-dc7f-4eb9-9fd6-d8fe3198c465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abe6069f-dc7f-4eb9-9fd6-d8fe3198c465
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-abe6069f-dc7f-4eb9-9fd6-d8fe3198c465
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
Content-Length: 253

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist","correlationId":"qa-abe6069f-dc7f-4eb9-9fd6-d8fe3198c465"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3713da95-ce25-4a6a-870e-fb63b132c0cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3713da95-ce25-4a6a-870e-fb63b132c0cb
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3713da95-ce25-4a6a-870e-fb63b132c0cb
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
correlation: qa-48d3b43c-1fd3-4b45-8ff0-7a832d63f3e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-48d3b43c-1fd3-4b45-8ff0-7a832d63f3e1
Content-Type: application/json

--- request body ---
{"handle":"qa-212a9570bd51","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:42:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-48d3b43c-1fd3-4b45-8ff0-7a832d63f3e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 276
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-48d3b43c-1fd3-4b45-8ff0-7a832d63f3e1"}
```
