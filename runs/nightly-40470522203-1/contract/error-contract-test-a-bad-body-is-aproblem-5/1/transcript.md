# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 39 | `qa-33ce3ee4-9dc7-49ba-b9af-a730a69e5ce5` |
| 2 | `POST /v1/accounts` | 201 | 36 | `qa-c00c6952-3cfa-4a90-9208-1fd91b744eb0` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-72e116fe-183d-4b56-bed8-77e6ded32595` |
| 4 | `POST /v1/conversations` | 201 | 31 | `qa-c0dfe679-667e-4e10-950a-2816f25157f3` |
| 5 | `POST /v1/accounts` | 422 | 33 | `qa-1af2bf77-74dd-4bf2-a715-d491ccc2559d` |
| 6 | `POST /v1/auth/token` | 200 | 38 | `qa-5e44233b-88a6-43be-8d9b-754c4ea63f56` |
| 7 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-9296e117-c4b0-4891-82b2-2c6383c1ea00` |
| 8 | `POST /v1/auth/token` | 401 | 13 | `qa-e331f8e9-37da-4869-a250-77513261bde3` |
| 9 | `DELETE /v1/accounts/me` | 204 | 26 | `qa-a1e9a22c-2ae4-4757-85e6-ad9abb887041` |
| 10 | `POST /v1/auth/token` | 401 | 24 | `qa-1efe2363-1026-4460-bd02-952fc2cee219` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-33ce3ee4-9dc7-49ba-b9af-a730a69e5ce5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ce3ee4-9dc7-49ba-b9af-a730a69e5ce5
Content-Type: application/json

--- request body ---
{"handle":"qa-9585f00259d3","displayName":"QA 9585f00259d3","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-33ce3ee4-9dc7-49ba-b9af-a730a69e5ce5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Location: /v1/accounts/qa-9585f00259d3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6bbbadd4-addf-422b-bfd1-74f5a64f160e","handle":"qa-9585f00259d3","displayName":"QA 9585f00259d3","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.179126875Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-c00c6952-3cfa-4a90-9208-1fd91b744eb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c00c6952-3cfa-4a90-9208-1fd91b744eb0
Content-Type: application/json

--- request body ---
{"handle":"qa-15acfea9257e","displayName":"QA 15acfea9257e","password":"****","region":"eu"}

--- response: 201 in 36 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c00c6952-3cfa-4a90-9208-1fd91b744eb0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 7
Location: /v1/accounts/qa-15acfea9257e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f8f49cc6-7a9f-4cdf-8f81-7eb1595a93aa","handle":"qa-15acfea9257e","displayName":"QA 15acfea9257e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:34.251344753Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-72e116fe-183d-4b56-bed8-77e6ded32595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72e116fe-183d-4b56-bed8-77e6ded32595
Content-Type: application/json

--- request body ---
{"handle":"qa-9585f00259d3","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-72e116fe-183d-4b56-bed8-77e6ded32595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 454
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6bbbadd4-addf-422b-bfd1-74f5a64f160e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c0dfe679-667e-4e10-950a-2816f25157f3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0dfe679-667e-4e10-950a-2816f25157f3
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-15acfea9257e","subject":"Error contract","message":"Hi"}

--- response: 201 in 31 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0dfe679-667e-4e10-950a-2816f25157f3
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
Location: /v1/conversations/cnv_953a76fb-8c4b-4652-8e75-727a82a97df9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_953a76fb-8c4b-4652-8e75-727a82a97df9","subject":"Error contract","status":"open","region":"eu","participants":["qa-9585f00259d3","qa-15acfea9257e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:34.338381540Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-1af2bf77-74dd-4bf2-a715-d491ccc2559d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1af2bf77-74dd-4bf2-a715-d491ccc2559d
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1af2bf77-74dd-4bf2-a715-d491ccc2559d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 446
RateLimit-Reset: 7
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-1af2bf77-74dd-4bf2-a715-d491ccc2559d","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5e44233b-88a6-43be-8d9b-754c4ea63f56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e44233b-88a6-43be-8d9b-754c4ea63f56
Content-Type: application/json

--- request body ---
{"handle":"qa-15acfea9257e","password":"****"}

--- response: 200 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e44233b-88a6-43be-8d9b-754c4ea63f56
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 430
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f8f49cc6-7a9f-4cdf-8f81-7eb1595a93aa"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9296e117-c4b0-4891-82b2-2c6383c1ea00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9296e117-c4b0-4891-82b2-2c6383c1ea00
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9296e117-c4b0-4891-82b2-2c6383c1ea00
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
```

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-e331f8e9-37da-4869-a250-77513261bde3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e331f8e9-37da-4869-a250-77513261bde3
Content-Type: application/json

--- request body ---
{"handle":"qa-15acfea9257e","password":"****"}

--- response: 401 in 13 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e331f8e9-37da-4869-a250-77513261bde3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e331f8e9-37da-4869-a250-77513261bde3"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1e9a22c-2ae4-4757-85e6-ad9abb887041

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1e9a22c-2ae4-4757-85e6-ad9abb887041
Content-Type: application/json

--- response: 204 in 26 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1e9a22c-2ae4-4757-85e6-ad9abb887041
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
correlation: qa-1efe2363-1026-4460-bd02-952fc2cee219

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1efe2363-1026-4460-bd02-952fc2cee219
Content-Type: application/json

--- request body ---
{"handle":"qa-9585f00259d3","password":"****"}

--- response: 401 in 24 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1efe2363-1026-4460-bd02-952fc2cee219
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 411
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1efe2363-1026-4460-bd02-952fc2cee219"}
```
