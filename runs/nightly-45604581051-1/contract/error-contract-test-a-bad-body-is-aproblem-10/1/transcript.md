# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[10]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 33 | `qa-43972e0a-0db4-47ec-b663-1bf2b97c57eb` |
| 2 | `POST /v1/accounts` | 201 | 16 | `qa-4f9f652e-2a09-49a1-9892-d533e485db30` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-58c2ce65-e7ae-4f0f-9d06-7d84988f9595` |
| 4 | `POST /v1/conversations` | 201 | 15 | `qa-537c1209-fd1b-4b51-a953-4125d2050915` |
| 5 | `POST /v1/conversations` | 415 | 12 | `qa-d88a9231-3d1b-4b3b-9763-95affebdff77` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-1808c273-2eb2-454e-b2de-bbd02a8dfa79` |
| 7 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-f3b9ac61-9cf1-45c2-ba25-937e522645e7` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-d6ca013b-2d4b-4edc-86a8-fccc9dda7e45` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-a3135638-5b34-4515-96f0-7b4500298dc3` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-38d29a16-6992-4473-bca9-ba6fa2c4c41e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-43972e0a-0db4-47ec-b663-1bf2b97c57eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43972e0a-0db4-47ec-b663-1bf2b97c57eb
Content-Type: application/json

--- request body ---
{"handle":"qa-74777158add2","displayName":"QA 74777158add2","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-43972e0a-0db4-47ec-b663-1bf2b97c57eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 410
RateLimit-Reset: 8
Location: /v1/accounts/qa-74777158add2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5b6336e6-7152-4f57-994b-b7567d2a6b3a","handle":"qa-74777158add2","displayName":"QA 74777158add2","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.924611088Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4f9f652e-2a09-49a1-9892-d533e485db30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4f9f652e-2a09-49a1-9892-d533e485db30
Content-Type: application/json

--- request body ---
{"handle":"qa-4e89bbc4b7a7","displayName":"QA 4e89bbc4b7a7","password":"****","region":"eu"}

--- response: 201 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4f9f652e-2a09-49a1-9892-d533e485db30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 405
RateLimit-Reset: 8
Location: /v1/accounts/qa-4e89bbc4b7a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34b0a19d-c591-4c3c-935f-03aaab5a3dd7","handle":"qa-4e89bbc4b7a7","displayName":"QA 4e89bbc4b7a7","region":"eu","role":"user","createdAt":"2026-11-25T11:27:58.955189857Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-58c2ce65-e7ae-4f0f-9d06-7d84988f9595

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-58c2ce65-e7ae-4f0f-9d06-7d84988f9595
Content-Type: application/json

--- request body ---
{"handle":"qa-74777158add2","password":"****"}

--- response: 200 in 19 ms ---
Date: Wed, 25 Nov 2026 11:27:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-58c2ce65-e7ae-4f0f-9d06-7d84988f9595
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5b6336e6-7152-4f57-994b-b7567d2a6b3a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-537c1209-fd1b-4b51-a953-4125d2050915

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-537c1209-fd1b-4b51-a953-4125d2050915
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e89bbc4b7a7","subject":"Error contract","message":"Hi"}

--- response: 201 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-537c1209-fd1b-4b51-a953-4125d2050915
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
Location: /v1/conversations/cnv_0137829d-529e-4a3e-8c10-4679e38a8cdf
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_0137829d-529e-4a3e-8c10-4679e38a8cdf","subject":"Error contract","status":"open","region":"eu","participants":["qa-74777158add2","qa-4e89bbc4b7a7"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-25T11:27:59.004579557Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-d88a9231-3d1b-4b3b-9763-95affebdff77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d88a9231-3d1b-4b3b-9763-95affebdff77
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 12 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d88a9231-3d1b-4b3b-9763-95affebdff77
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
Content-Length: 257

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-d88a9231-3d1b-4b3b-9763-95affebdff77"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-1808c273-2eb2-454e-b2de-bbd02a8dfa79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1808c273-2eb2-454e-b2de-bbd02a8dfa79
Content-Type: application/json

--- request body ---
{"handle":"qa-4e89bbc4b7a7","password":"****"}

--- response: 200 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1808c273-2eb2-454e-b2de-bbd02a8dfa79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 383
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34b0a19d-c591-4c3c-935f-03aaab5a3dd7"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f3b9ac61-9cf1-45c2-ba25-937e522645e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3b9ac61-9cf1-45c2-ba25-937e522645e7
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f3b9ac61-9cf1-45c2-ba25-937e522645e7
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
correlation: qa-d6ca013b-2d4b-4edc-86a8-fccc9dda7e45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6ca013b-2d4b-4edc-86a8-fccc9dda7e45
Content-Type: application/json

--- request body ---
{"handle":"qa-4e89bbc4b7a7","password":"****"}

--- response: 401 in 22 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6ca013b-2d4b-4edc-86a8-fccc9dda7e45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 373
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d6ca013b-2d4b-4edc-86a8-fccc9dda7e45"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a3135638-5b34-4515-96f0-7b4500298dc3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3135638-5b34-4515-96f0-7b4500298dc3
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a3135638-5b34-4515-96f0-7b4500298dc3
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-38d29a16-6992-4473-bca9-ba6fa2c4c41e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-38d29a16-6992-4473-bca9-ba6fa2c4c41e
Content-Type: application/json

--- request body ---
{"handle":"qa-74777158add2","password":"****"}

--- response: 401 in 13 ms ---
Date: Wed, 25 Nov 2026 11:27:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-38d29a16-6992-4473-bca9-ba6fa2c4c41e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-38d29a16-6992-4473-bca9-ba6fa2c4c41e"}
```
