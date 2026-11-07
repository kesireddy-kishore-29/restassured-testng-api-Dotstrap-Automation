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
| 1 | `POST /v1/accounts` | 201 | 34 | `qa-090ba12d-6b73-4c81-96c6-9802b78a97c5` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-772dfaf4-88ea-4cbc-9d6c-9aa7f2b8eb6e` |
| 3 | `POST /v1/auth/token` | 200 | 24 | `qa-a4303e13-f8aa-4e17-946a-18313de403fc` |
| 4 | `POST /v1/conversations` | 201 | 20 | `qa-5e2097c8-d2e3-4f08-adda-8ecee13e602e` |
| 5 | `POST /v1/conversations` | 415 | 8 | `qa-979d4278-078a-461e-bcf9-13911be67903` |
| 6 | `POST /v1/auth/token` | 200 | 31 | `qa-811befb0-8624-4c3b-8b4b-ea7ff68be0ab` |
| 7 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-11cac24c-c34a-44fc-8599-0996649dbf50` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-4c9215ef-cbd3-41a3-bcb8-250cfe41ee90` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-395e2290-7554-4f2a-9cd7-7767960ca5dd` |
| 10 | `POST /v1/auth/token` | 401 | 23 | `qa-c7b40aa2-29f7-42ac-ab34-8d996651dbd1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-090ba12d-6b73-4c81-96c6-9802b78a97c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-090ba12d-6b73-4c81-96c6-9802b78a97c5
Content-Type: application/json

--- request body ---
{"handle":"qa-50d298bca215","displayName":"QA 50d298bca215","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-090ba12d-6b73-4c81-96c6-9802b78a97c5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 424
RateLimit-Reset: 7
Location: /v1/accounts/qa-50d298bca215
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b798ff0-1ee2-480c-99eb-533f4aed1f82","handle":"qa-50d298bca215","displayName":"QA 50d298bca215","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.748319119Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-772dfaf4-88ea-4cbc-9d6c-9aa7f2b8eb6e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-772dfaf4-88ea-4cbc-9d6c-9aa7f2b8eb6e
Content-Type: application/json

--- request body ---
{"handle":"qa-95b27ee6969e","displayName":"QA 95b27ee6969e","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-772dfaf4-88ea-4cbc-9d6c-9aa7f2b8eb6e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 416
RateLimit-Reset: 7
Location: /v1/accounts/qa-95b27ee6969e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e1cecbbf-de37-4a03-9290-3a383bac923c","handle":"qa-95b27ee6969e","displayName":"QA 95b27ee6969e","region":"eu","role":"user","createdAt":"2026-10-31T08:31:35.802886406Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-a4303e13-f8aa-4e17-946a-18313de403fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4303e13-f8aa-4e17-946a-18313de403fc
Content-Type: application/json

--- request body ---
{"handle":"qa-50d298bca215","password":"****"}

--- response: 200 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-a4303e13-f8aa-4e17-946a-18313de403fc
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b798ff0-1ee2-480c-99eb-533f4aed1f82"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-5e2097c8-d2e3-4f08-adda-8ecee13e602e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e2097c8-d2e3-4f08-adda-8ecee13e602e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-95b27ee6969e","subject":"Error contract","message":"Hi"}

--- response: 201 in 20 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e2097c8-d2e3-4f08-adda-8ecee13e602e
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
Location: /v1/conversations/cnv_435688ac-a002-4111-a9f1-d6504102074f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_435688ac-a002-4111-a9f1-d6504102074f","subject":"Error contract","status":"open","region":"eu","participants":["qa-50d298bca215","qa-95b27ee6969e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-31T08:31:35.869118011Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-979d4278-078a-461e-bcf9-13911be67903

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-979d4278-078a-461e-bcf9-13911be67903
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 8 ms ---
Date: Sat, 31 Oct 2026 08:31:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-979d4278-078a-461e-bcf9-13911be67903
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-979d4278-078a-461e-bcf9-13911be67903"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-811befb0-8624-4c3b-8b4b-ea7ff68be0ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-811befb0-8624-4c3b-8b4b-ea7ff68be0ab
Content-Type: application/json

--- request body ---
{"handle":"qa-95b27ee6969e","password":"****"}

--- response: 200 in 31 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-811befb0-8624-4c3b-8b4b-ea7ff68be0ab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 404
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e1cecbbf-de37-4a03-9290-3a383bac923c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-11cac24c-c34a-44fc-8599-0996649dbf50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-11cac24c-c34a-44fc-8599-0996649dbf50
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-11cac24c-c34a-44fc-8599-0996649dbf50
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
correlation: qa-4c9215ef-cbd3-41a3-bcb8-250cfe41ee90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c9215ef-cbd3-41a3-bcb8-250cfe41ee90
Content-Type: application/json

--- request body ---
{"handle":"qa-95b27ee6969e","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c9215ef-cbd3-41a3-bcb8-250cfe41ee90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4c9215ef-cbd3-41a3-bcb8-250cfe41ee90"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-395e2290-7554-4f2a-9cd7-7767960ca5dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-395e2290-7554-4f2a-9cd7-7767960ca5dd
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-395e2290-7554-4f2a-9cd7-7767960ca5dd
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
correlation: qa-c7b40aa2-29f7-42ac-ab34-8d996651dbd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7b40aa2-29f7-42ac-ab34-8d996651dbd1
Content-Type: application/json

--- request body ---
{"handle":"qa-50d298bca215","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 31 Oct 2026 08:31:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7b40aa2-29f7-42ac-ab34-8d996651dbd1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 388
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-c7b40aa2-29f7-42ac-ab34-8d996651dbd1"}
```
