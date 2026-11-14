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
| 1 | `POST /v1/accounts` | 201 | 27 | `qa-88eee0bb-e7bd-472b-84c5-f3fa1747db5b` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-d5e9cc0d-622e-4e94-9703-c80b208471a2` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-f26f558d-6a2a-4f68-bbdd-52df17c3b583` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-c7a1eae4-b388-4b7e-934a-5198c4e91f99` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 9 | `qa-c7c563e7-ccaf-44bf-b55b-23574be61c10` |
| 6 | `POST /v1/auth/token` | 200 | 34 | `qa-6fcb73e2-98b8-48b5-b202-93413ccf6df9` |
| 7 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-33ef0fd9-c94a-4d7b-8980-6b43753666a0` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-690c4f49-748a-477f-8443-85625348044f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-a1fdf6ea-5fde-4296-af1d-1fd0dec9b1e1` |
| 10 | `POST /v1/auth/token` | 401 | 7 | `qa-1cfcfabc-ee7f-46bf-9cd0-92d615d753ea` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-88eee0bb-e7bd-472b-84c5-f3fa1747db5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88eee0bb-e7bd-472b-84c5-f3fa1747db5b
Content-Type: application/json

--- request body ---
{"handle":"qa-7e12227795a9","displayName":"QA 7e12227795a9","password":"****","region":"eu"}

--- response: 201 in 27 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-88eee0bb-e7bd-472b-84c5-f3fa1747db5b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 366
RateLimit-Reset: 8
Location: /v1/accounts/qa-7e12227795a9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1ad14e39-f78f-49e5-b391-23d1c97a0b59","handle":"qa-7e12227795a9","displayName":"QA 7e12227795a9","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.824865017Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d5e9cc0d-622e-4e94-9703-c80b208471a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5e9cc0d-622e-4e94-9703-c80b208471a2
Content-Type: application/json

--- request body ---
{"handle":"qa-68810c89536b","displayName":"QA 68810c89536b","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5e9cc0d-622e-4e94-9703-c80b208471a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 358
RateLimit-Reset: 8
Location: /v1/accounts/qa-68810c89536b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_51296e5a-87ae-4aaf-a590-055c48709352","handle":"qa-68810c89536b","displayName":"QA 68810c89536b","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.861039514Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f26f558d-6a2a-4f68-bbdd-52df17c3b583

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26f558d-6a2a-4f68-bbdd-52df17c3b583
Content-Type: application/json

--- request body ---
{"handle":"qa-7e12227795a9","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f26f558d-6a2a-4f68-bbdd-52df17c3b583
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1ad14e39-f78f-49e5-b391-23d1c97a0b59"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c7a1eae4-b388-4b7e-934a-5198c4e91f99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7a1eae4-b388-4b7e-934a-5198c4e91f99
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-68810c89536b","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7a1eae4-b388-4b7e-934a-5198c4e91f99
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
Location: /v1/conversations/cnv_30c3595e-3fa9-4d45-8c27-4ba1d0365df7
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_30c3595e-3fa9-4d45-8c27-4ba1d0365df7","subject":"Error contract","status":"open","region":"eu","participants":["qa-7e12227795a9","qa-68810c89536b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.924133858Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_30c3595e-3fa9-4d45-8c27-4ba1d0365df7/messages
correlation: qa-c7c563e7-ccaf-44bf-b55b-23574be61c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7c563e7-ccaf-44bf-b55b-23574be61c10
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 9 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c7c563e7-ccaf-44bf-b55b-23574be61c10
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

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_30c3595e-3fa9-4d45-8c27-4ba1d0365df7/messages","correlationId":"qa-c7c563e7-ccaf-44bf-b55b-23574be61c10"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6fcb73e2-98b8-48b5-b202-93413ccf6df9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fcb73e2-98b8-48b5-b202-93413ccf6df9
Content-Type: application/json

--- request body ---
{"handle":"qa-68810c89536b","password":"****"}

--- response: 200 in 34 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fcb73e2-98b8-48b5-b202-93413ccf6df9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_51296e5a-87ae-4aaf-a590-055c48709352"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-33ef0fd9-c94a-4d7b-8980-6b43753666a0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33ef0fd9-c94a-4d7b-8980-6b43753666a0
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-33ef0fd9-c94a-4d7b-8980-6b43753666a0
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
correlation: qa-690c4f49-748a-477f-8443-85625348044f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-690c4f49-748a-477f-8443-85625348044f
Content-Type: application/json

--- request body ---
{"handle":"qa-68810c89536b","password":"****"}

--- response: 401 in 15 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-690c4f49-748a-477f-8443-85625348044f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 331
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-690c4f49-748a-477f-8443-85625348044f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a1fdf6ea-5fde-4296-af1d-1fd0dec9b1e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1fdf6ea-5fde-4296-af1d-1fd0dec9b1e1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a1fdf6ea-5fde-4296-af1d-1fd0dec9b1e1
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
correlation: qa-1cfcfabc-ee7f-46bf-9cd0-92d615d753ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cfcfabc-ee7f-46bf-9cd0-92d615d753ea
Content-Type: application/json

--- request body ---
{"handle":"qa-7e12227795a9","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 12 Nov 2026 09:56:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1cfcfabc-ee7f-46bf-9cd0-92d615d753ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 326
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1cfcfabc-ee7f-46bf-9cd0-92d615d753ea"}
```
