# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 415]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[4]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-e42e6b01-ef10-4c08-9a68-33a8745d0cf0` |
| 2 | `POST /v1/accounts` | 201 | 12 | `qa-a2c24a5d-3aa3-4820-a56c-bc0bde8c517b` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-5b4a2ccf-be1d-42e4-b636-e8f181427257` |
| 4 | `POST /v1/conversations` | 201 | 56 | `qa-69fa85b1-9da8-45a2-a138-b6ad66ad415a` |
| 5 | `POST /v1/accounts` | 415 | 43 | `qa-9927aa7b-52e4-4fe3-a5bd-06b25fef2b5c` |
| 6 | `POST /v1/auth/token` | 200 | 26 | `qa-bb54ad32-0451-4d3b-9a24-b33e20058fe3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-1b223564-68aa-4df1-bdfd-b5bdeb117a3c` |
| 8 | `POST /v1/auth/token` | 401 | 30 | `qa-734de79d-5da4-4cc3-a1c9-9864702c660e` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-ebae0ab0-f4b5-4d55-9696-a151b24e6dc4` |
| 10 | `POST /v1/auth/token` | 401 | 17 | `qa-6451cb3e-e1c9-4c9a-b361-c5908bf22398` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e42e6b01-ef10-4c08-9a68-33a8745d0cf0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e42e6b01-ef10-4c08-9a68-33a8745d0cf0
Content-Type: application/json

--- request body ---
{"handle":"qa-bc4f9b5f1501","displayName":"QA bc4f9b5f1501","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-e42e6b01-ef10-4c08-9a68-33a8745d0cf0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 9
Location: /v1/accounts/qa-bc4f9b5f1501
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6473b630-38da-4d9f-b702-084ae7bbcda2","handle":"qa-bc4f9b5f1501","displayName":"QA bc4f9b5f1501","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.068400173Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a2c24a5d-3aa3-4820-a56c-bc0bde8c517b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a2c24a5d-3aa3-4820-a56c-bc0bde8c517b
Content-Type: application/json

--- request body ---
{"handle":"qa-8c18cfbb1871","displayName":"QA 8c18cfbb1871","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a2c24a5d-3aa3-4820-a56c-bc0bde8c517b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 9
Location: /v1/accounts/qa-8c18cfbb1871
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ee0a5419-566e-4947-a441-3c7ebcd73194","handle":"qa-8c18cfbb1871","displayName":"QA 8c18cfbb1871","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.096904509Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-5b4a2ccf-be1d-42e4-b636-e8f181427257

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b4a2ccf-be1d-42e4-b636-e8f181427257
Content-Type: application/json

--- request body ---
{"handle":"qa-bc4f9b5f1501","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-5b4a2ccf-be1d-42e4-b636-e8f181427257
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6473b630-38da-4d9f-b702-084ae7bbcda2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-69fa85b1-9da8-45a2-a138-b6ad66ad415a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69fa85b1-9da8-45a2-a138-b6ad66ad415a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8c18cfbb1871","subject":"Error contract","message":"Hi"}

--- response: 201 in 56 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-69fa85b1-9da8-45a2-a138-b6ad66ad415a
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
Location: /v1/conversations/cnv_22865ed3-434c-4ca8-a658-5caa635dfeae
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_22865ed3-434c-4ca8-a658-5caa635dfeae","subject":"Error contract","status":"open","region":"eu","participants":["qa-bc4f9b5f1501","qa-8c18cfbb1871"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.194947807Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-9927aa7b-52e4-4fe3-a5bd-06b25fef2b5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9927aa7b-52e4-4fe3-a5bd-06b25fef2b5c
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 43 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9927aa7b-52e4-4fe3-a5bd-06b25fef2b5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 449
RateLimit-Reset: 8
Content-Length: 252

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/accounts","correlationId":"qa-9927aa7b-52e4-4fe3-a5bd-06b25fef2b5c"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bb54ad32-0451-4d3b-9a24-b33e20058fe3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb54ad32-0451-4d3b-9a24-b33e20058fe3
Content-Type: application/json

--- request body ---
{"handle":"qa-8c18cfbb1871","password":"****"}

--- response: 200 in 26 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb54ad32-0451-4d3b-9a24-b33e20058fe3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 436
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ee0a5419-566e-4947-a441-3c7ebcd73194"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1b223564-68aa-4df1-bdfd-b5bdeb117a3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b223564-68aa-4df1-bdfd-b5bdeb117a3c
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1b223564-68aa-4df1-bdfd-b5bdeb117a3c
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
correlation: qa-734de79d-5da4-4cc3-a1c9-9864702c660e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-734de79d-5da4-4cc3-a1c9-9864702c660e
Content-Type: application/json

--- request body ---
{"handle":"qa-8c18cfbb1871","password":"****"}

--- response: 401 in 30 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-734de79d-5da4-4cc3-a1c9-9864702c660e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-734de79d-5da4-4cc3-a1c9-9864702c660e"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ebae0ab0-f4b5-4d55-9696-a151b24e6dc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebae0ab0-f4b5-4d55-9696-a151b24e6dc4
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ebae0ab0-f4b5-4d55-9696-a151b24e6dc4
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
correlation: qa-6451cb3e-e1c9-4c9a-b361-c5908bf22398

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6451cb3e-e1c9-4c9a-b361-c5908bf22398
Content-Type: application/json

--- request body ---
{"handle":"qa-bc4f9b5f1501","password":"****"}

--- response: 401 in 17 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6451cb3e-e1c9-4c9a-b361-c5908bf22398
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 422
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6451cb3e-e1c9-4c9a-b361-c5908bf22398"}
```
