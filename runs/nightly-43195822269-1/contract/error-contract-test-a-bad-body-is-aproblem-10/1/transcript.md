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
| 1 | `POST /v1/accounts` | 201 | 35 | `qa-810b863d-8a62-4cbb-957c-58a3457ac305` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-d9e6c0af-84df-4651-bbe9-3b3e39bbaecd` |
| 3 | `POST /v1/auth/token` | 200 | 16 | `qa-2d502e82-7531-48f4-9480-555edc19807b` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-bb575eda-ed60-476d-89c3-1add735030b9` |
| 5 | `POST /v1/conversations` | 415 | 14 | `qa-51311433-6a21-4696-ae0a-98893d899e12` |
| 6 | `POST /v1/auth/token` | 200 | 33 | `qa-62258a19-b4ae-473b-b4c0-641ba57c96c7` |
| 7 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-b974a7af-6bf1-4b13-8989-8fb17e30d77b` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-3c87096a-3182-4924-9d5e-68164ba04320` |
| 9 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-ae7a0c39-2d58-43b9-b287-56fc818a0eb1` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-905fb963-fc9a-40de-98b1-5c9590e5377f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-810b863d-8a62-4cbb-957c-58a3457ac305

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-810b863d-8a62-4cbb-957c-58a3457ac305
Content-Type: application/json

--- request body ---
{"handle":"qa-55224226c027","displayName":"QA 55224226c027","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-810b863d-8a62-4cbb-957c-58a3457ac305
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Location: /v1/accounts/qa-55224226c027
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02022a5a-d64b-4da3-835a-7f03a22359c2","handle":"qa-55224226c027","displayName":"QA 55224226c027","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.583688872Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9e6c0af-84df-4651-bbe9-3b3e39bbaecd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9e6c0af-84df-4651-bbe9-3b3e39bbaecd
Content-Type: application/json

--- request body ---
{"handle":"qa-f9680ae79c90","displayName":"QA f9680ae79c90","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9e6c0af-84df-4651-bbe9-3b3e39bbaecd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 8
Location: /v1/accounts/qa-f9680ae79c90
X-Served-Region: eu
Content-Length: 181

{"id":"acc_811b211b-52ea-4612-8f97-ecf170038205","handle":"qa-f9680ae79c90","displayName":"QA f9680ae79c90","region":"eu","role":"user","createdAt":"2026-11-12T09:56:31.599935234Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2d502e82-7531-48f4-9480-555edc19807b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d502e82-7531-48f4-9480-555edc19807b
Content-Type: application/json

--- request body ---
{"handle":"qa-55224226c027","password":"****"}

--- response: 200 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d502e82-7531-48f4-9480-555edc19807b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 391
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02022a5a-d64b-4da3-835a-7f03a22359c2"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bb575eda-ed60-476d-89c3-1add735030b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb575eda-ed60-476d-89c3-1add735030b9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f9680ae79c90","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb575eda-ed60-476d-89c3-1add735030b9
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
Location: /v1/conversations/cnv_553bf2a8-1da0-4ad8-a7cc-c6a0cb287684
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_553bf2a8-1da0-4ad8-a7cc-c6a0cb287684","subject":"Error contract","status":"open","region":"eu","participants":["qa-55224226c027","qa-f9680ae79c90"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-12T09:56:31.649100004Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-51311433-6a21-4696-ae0a-98893d899e12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51311433-6a21-4696-ae0a-98893d899e12
Content-Type: text/plain; charset=ISO-8859-1

--- request body ---
plain=text

--- response: 415 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51311433-6a21-4696-ae0a-98893d899e12
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

{"type":"https://reference-service.example/problems/unsupported-media-type","title":"Unsupported media type","status":415,"detail":"Send the body as application/json.","instance":"/v1/conversations","correlationId":"qa-51311433-6a21-4696-ae0a-98893d899e12"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-62258a19-b4ae-473b-b4c0-641ba57c96c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62258a19-b4ae-473b-b4c0-641ba57c96c7
Content-Type: application/json

--- request body ---
{"handle":"qa-f9680ae79c90","password":"****"}

--- response: 200 in 33 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-62258a19-b4ae-473b-b4c0-641ba57c96c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 379
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_811b211b-52ea-4612-8f97-ecf170038205"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b974a7af-6bf1-4b13-8989-8fb17e30d77b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b974a7af-6bf1-4b13-8989-8fb17e30d77b
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b974a7af-6bf1-4b13-8989-8fb17e30d77b
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
correlation: qa-3c87096a-3182-4924-9d5e-68164ba04320

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c87096a-3182-4924-9d5e-68164ba04320
Content-Type: application/json

--- request body ---
{"handle":"qa-f9680ae79c90","password":"****"}

--- response: 401 in 22 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3c87096a-3182-4924-9d5e-68164ba04320
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3c87096a-3182-4924-9d5e-68164ba04320"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ae7a0c39-2d58-43b9-b287-56fc818a0eb1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae7a0c39-2d58-43b9-b287-56fc818a0eb1
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ae7a0c39-2d58-43b9-b287-56fc818a0eb1
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
correlation: qa-905fb963-fc9a-40de-98b1-5c9590e5377f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-905fb963-fc9a-40de-98b1-5c9590e5377f
Content-Type: application/json

--- request body ---
{"handle":"qa-55224226c027","password":"****"}

--- response: 401 in 13 ms ---
Date: Thu, 12 Nov 2026 09:56:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-905fb963-fc9a-40de-98b1-5c9590e5377f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-905fb963-fc9a-40de-98b1-5c9590e5377f"}
```
