# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-6e296721-9fb0-468e-ae16-14aa6033b4fa` |
| 2 | `POST /v1/accounts` | 201 | 42 | `qa-6b85093f-9e23-4548-b6eb-6027dcc8862f` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-3116b02c-c01d-40fb-ac76-1dd498317520` |
| 4 | `POST /v1/conversations` | 201 | 10 | `qa-0a294023-f8bb-4be8-8d77-7063baf48484` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 36 | `qa-5c9715e8-e06c-4a98-96df-afc526a49318` |
| 6 | `POST /v1/auth/token` | 200 | 23 | `qa-8726dba9-63a8-4603-89aa-4548a6e588c3` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-3d242bca-1859-4d9b-981a-f951377552ee` |
| 8 | `POST /v1/auth/token` | 401 | 12 | `qa-960bee8f-162f-4b9a-9d6b-f0727dbaf05d` |
| 9 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-b7800625-debe-4e57-ae3c-deae69895700` |
| 10 | `POST /v1/auth/token` | 401 | 9 | `qa-0c89d95f-298b-4d1a-9588-9a389a0691f2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6e296721-9fb0-468e-ae16-14aa6033b4fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e296721-9fb0-468e-ae16-14aa6033b4fa
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2dd15781e6","displayName":"QA 9d2dd15781e6","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e296721-9fb0-468e-ae16-14aa6033b4fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Location: /v1/accounts/qa-9d2dd15781e6
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4194d727-61e6-484d-bbe1-7a395ad0443a","handle":"qa-9d2dd15781e6","displayName":"QA 9d2dd15781e6","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.625024977Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6b85093f-9e23-4548-b6eb-6027dcc8862f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b85093f-9e23-4548-b6eb-6027dcc8862f
Content-Type: application/json

--- request body ---
{"handle":"qa-7be5ee336d2d","displayName":"QA 7be5ee336d2d","password":"****","region":"eu"}

--- response: 201 in 42 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b85093f-9e23-4548-b6eb-6027dcc8862f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 356
RateLimit-Reset: 6
Location: /v1/accounts/qa-7be5ee336d2d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_856cfb22-8c97-434c-92b9-3ddc3d24ac3c","handle":"qa-7be5ee336d2d","displayName":"QA 7be5ee336d2d","region":"eu","role":"user","createdAt":"2026-11-05T09:37:56.679942942Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3116b02c-c01d-40fb-ac76-1dd498317520

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3116b02c-c01d-40fb-ac76-1dd498317520
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2dd15781e6","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-3116b02c-c01d-40fb-ac76-1dd498317520
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4194d727-61e6-484d-bbe1-7a395ad0443a"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0a294023-f8bb-4be8-8d77-7063baf48484

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a294023-f8bb-4be8-8d77-7063baf48484
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7be5ee336d2d","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a294023-f8bb-4be8-8d77-7063baf48484
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
Location: /v1/conversations/cnv_4ea8d921-5a31-4974-993f-3ff3e1a8135c
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4ea8d921-5a31-4974-993f-3ff3e1a8135c","subject":"Error contract","status":"open","region":"eu","participants":["qa-9d2dd15781e6","qa-7be5ee336d2d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:56.762238761Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_4ea8d921-5a31-4974-993f-3ff3e1a8135c/messages
correlation: qa-5c9715e8-e06c-4a98-96df-afc526a49318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c9715e8-e06c-4a98-96df-afc526a49318
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c9715e8-e06c-4a98-96df-afc526a49318
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_4ea8d921-5a31-4974-993f-3ff3e1a8135c/messages","correlationId":"qa-5c9715e8-e06c-4a98-96df-afc526a49318"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-8726dba9-63a8-4603-89aa-4548a6e588c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8726dba9-63a8-4603-89aa-4548a6e588c3
Content-Type: application/json

--- request body ---
{"handle":"qa-7be5ee336d2d","password":"****"}

--- response: 200 in 23 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-8726dba9-63a8-4603-89aa-4548a6e588c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 334
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_856cfb22-8c97-434c-92b9-3ddc3d24ac3c"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3d242bca-1859-4d9b-981a-f951377552ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d242bca-1859-4d9b-981a-f951377552ee
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3d242bca-1859-4d9b-981a-f951377552ee
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
correlation: qa-960bee8f-162f-4b9a-9d6b-f0727dbaf05d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-960bee8f-162f-4b9a-9d6b-f0727dbaf05d
Content-Type: application/json

--- request body ---
{"handle":"qa-7be5ee336d2d","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-960bee8f-162f-4b9a-9d6b-f0727dbaf05d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 332
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-960bee8f-162f-4b9a-9d6b-f0727dbaf05d"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b7800625-debe-4e57-ae3c-deae69895700

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7800625-debe-4e57-ae3c-deae69895700
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b7800625-debe-4e57-ae3c-deae69895700
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
correlation: qa-0c89d95f-298b-4d1a-9588-9a389a0691f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c89d95f-298b-4d1a-9588-9a389a0691f2
Content-Type: application/json

--- request body ---
{"handle":"qa-9d2dd15781e6","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0c89d95f-298b-4d1a-9588-9a389a0691f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 329
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0c89d95f-298b-4d1a-9588-9a389a0691f2"}
```
