# Transcript: Every operation answers an outage with a 503 problem and Retry-After [POST /v1/auth/token]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outageIsA503WithRetryAfter[0]` |
| Features | FEAT-RES-03, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 31 | `qa-9aaa7c25-cf23-4621-bc59-eb8733a94d1c` |
| 2 | `POST /v1/accounts` | 201 | 39 | `qa-eea95211-9481-4126-86b8-5773c3d17b11` |
| 3 | `POST /v1/auth/token` | 200 | 50 | `qa-41bed30b-f7ca-460d-be41-af991d7af5cc` |
| 4 | `POST /v1/conversations` | 201 | 19 | `qa-7aafca72-4c00-4263-b986-d57291bd636b` |
| 5 | `POST /v1/auth/token` | 503 | 22 | `qa-c72554d7-6d91-45b2-9266-b3a662db2bc8` |
| 6 | `POST /v1/auth/token` | 200 | 52 | `qa-6b0437f6-98b4-4a8c-903b-e3691e60a97e` |
| 7 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-f6788afb-66f1-40e5-be91-6f30ea723210` |
| 8 | `POST /v1/auth/token` | 401 | 16 | `qa-2615af61-9147-4f10-96f9-348b151715b5` |
| 9 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-358c3fb4-9f4d-4aba-b343-ff9dd8970a90` |
| 10 | `POST /v1/auth/token` | 401 | 19 | `qa-ad97b1a4-1fce-4368-8a4f-9e724b57a928` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9aaa7c25-cf23-4621-bc59-eb8733a94d1c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9aaa7c25-cf23-4621-bc59-eb8733a94d1c
Content-Type: application/json

--- request body ---
{"handle":"qa-da312024580b","displayName":"QA da312024580b","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-9aaa7c25-cf23-4621-bc59-eb8733a94d1c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-da312024580b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a4f1faf1-220a-4a0c-9d25-ff8b9fcd04de","handle":"qa-da312024580b","displayName":"QA da312024580b","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.829713932Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-eea95211-9481-4126-86b8-5773c3d17b11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eea95211-9481-4126-86b8-5773c3d17b11
Content-Type: application/json

--- request body ---
{"handle":"qa-b0b493227524","displayName":"QA b0b493227524","password":"****","region":"eu"}

--- response: 201 in 39 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-eea95211-9481-4126-86b8-5773c3d17b11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-b0b493227524
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6a3c2db4-b79f-4b8e-8f12-1af1605c0870","handle":"qa-b0b493227524","displayName":"QA b0b493227524","region":"eu","role":"user","createdAt":"2026-11-05T09:37:53.907664326Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-41bed30b-f7ca-460d-be41-af991d7af5cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41bed30b-f7ca-460d-be41-af991d7af5cc
Content-Type: application/json

--- request body ---
{"handle":"qa-da312024580b","password":"****"}

--- response: 200 in 50 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-41bed30b-f7ca-460d-be41-af991d7af5cc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 553
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a4f1faf1-220a-4a0c-9d25-ff8b9fcd04de"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-7aafca72-4c00-4263-b986-d57291bd636b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7aafca72-4c00-4263-b986-d57291bd636b
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b0b493227524","subject":"Error contract","message":"Hi"}

--- response: 201 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/json
X-Correlation-Id: qa-7aafca72-4c00-4263-b986-d57291bd636b
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
Location: /v1/conversations/cnv_afc5a996-0ace-4ba9-871a-505f92bc7dc8
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_afc5a996-0ace-4ba9-871a-505f92bc7dc8","subject":"Error contract","status":"open","region":"eu","participants":["qa-da312024580b","qa-b0b493227524"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-05T09:37:54.003734927Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-c72554d7-6d91-45b2-9266-b3a662db2bc8

--- request headers ---
Accept: application/json
X-Fault: unavailable-once
X-Fault-Key: c28df2f7-329c-4177-976a-5e3e7e1ad877
X-Correlation-Id: qa-c72554d7-6d91-45b2-9266-b3a662db2bc8
Content-Type: application/json

--- request body ---
{"handle":"qa-da312024580b","password":"****"}

--- response: 503 in 22 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c72554d7-6d91-45b2-9266-b3a662db2bc8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
Retry-After: 1
Content-Length: 258

{"type":"https://reference-service.example/problems/fault-injected","title":"Service unavailable (injected)","status":503,"detail":"Injected outage; retry after 1 second.","instance":"/v1/auth/token","correlationId":"qa-c72554d7-6d91-45b2-9266-b3a662db2bc8"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6b0437f6-98b4-4a8c-903b-e3691e60a97e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b0437f6-98b4-4a8c-903b-e3691e60a97e
Content-Type: application/json

--- request body ---
{"handle":"qa-b0b493227524","password":"****"}

--- response: 200 in 52 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b0437f6-98b4-4a8c-903b-e3691e60a97e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 517
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6a3c2db4-b79f-4b8e-8f12-1af1605c0870"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f6788afb-66f1-40e5-be91-6f30ea723210

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6788afb-66f1-40e5-be91-6f30ea723210
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f6788afb-66f1-40e5-be91-6f30ea723210
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
correlation: qa-2615af61-9147-4f10-96f9-348b151715b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2615af61-9147-4f10-96f9-348b151715b5
Content-Type: application/json

--- request body ---
{"handle":"qa-b0b493227524","password":"****"}

--- response: 401 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2615af61-9147-4f10-96f9-348b151715b5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 499
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2615af61-9147-4f10-96f9-348b151715b5"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-358c3fb4-9f4d-4aba-b343-ff9dd8970a90

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-358c3fb4-9f4d-4aba-b343-ff9dd8970a90
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: text/plain
X-Correlation-Id: qa-358c3fb4-9f4d-4aba-b343-ff9dd8970a90
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 9
X-Served-Region: eu
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-ad97b1a4-1fce-4368-8a4f-9e724b57a928

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad97b1a4-1fce-4368-8a4f-9e724b57a928
Content-Type: application/json

--- request body ---
{"handle":"qa-da312024580b","password":"****"}

--- response: 401 in 19 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ad97b1a4-1fce-4368-8a4f-9e724b57a928
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 488
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ad97b1a4-1fce-4368-8a4f-9e724b57a928"}
```
