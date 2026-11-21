# Transcript: Conversation, message, page and read-state match their schemas

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ContractTest#conversationResourcesMatchTheirContracts` |
| Features | FEAT-CONTRACT-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 455 | `qa-f6abd561-9e08-4a5f-bb93-5025ae984060` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-3f7c475e-06f9-4ef3-b4ef-d0312a9d0cc7` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-f101c955-b22b-4b0f-8dfa-3809ee3c23f4` |
| 4 | `POST /v1/conversations` | 201 | 72 | `qa-3756ce3a-0aaa-455a-98ad-12809a60f5f8` |
| 5 | `GET /v1/conversations` | 200 | 33 | `qa-9161dc17-aaa4-4ee4-b3bb-a41cc09aa0f8` |
| 6 | `GET /v1/conversations/{id}` | 200 | 22 | `qa-3e635499-7140-4092-859b-6df329c4b822` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 26 | `qa-16279918-6ae2-4a00-81a7-511e1e597302` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 19 | `qa-578527b2-a605-4f5d-bc28-296c9aa923f0` |
| 9 | `POST /v1/auth/token` | 200 | 29 | `qa-131376f9-4e00-43ac-ba15-7b1a36e8eec1` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 23 | `qa-de18e045-a0af-411f-8461-c54f9e1e06e8` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-3f2c681f-86d6-43fc-a34d-0bfb103c01e8` |
| 12 | `POST /v1/auth/token` | 401 | 18 | `qa-72f90772-319f-47b7-88d7-bb3b2018e40a` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-895094e6-dd5f-49a3-92ce-adfdc19c48ad` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-6fc58052-d77a-4425-b1e4-e25a6ea66301` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f6abd561-9e08-4a5f-bb93-5025ae984060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6abd561-9e08-4a5f-bb93-5025ae984060
Content-Type: application/json

--- request body ---
{"handle":"qa-cc90a5566597","displayName":"QA cc90a5566597","password":"****","region":"eu"}

--- response: 201 in 455 ms ---
Date: Sat, 21 Nov 2026 09:57:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6abd561-9e08-4a5f-bb93-5025ae984060
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
Location: /v1/accounts/qa-cc90a5566597
X-Served-Region: eu
Content-Length: 181

{"id":"acc_81fcd86c-7518-4e0a-831d-537ad28ad018","handle":"qa-cc90a5566597","displayName":"QA cc90a5566597","region":"eu","role":"user","createdAt":"2026-11-21T09:57:07.982534333Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3f7c475e-06f9-4ef3-b4ef-d0312a9d0cc7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f7c475e-06f9-4ef3-b4ef-d0312a9d0cc7
Content-Type: application/json

--- request body ---
{"handle":"qa-f0e8d639244a","displayName":"QA f0e8d639244a","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f7c475e-06f9-4ef3-b4ef-d0312a9d0cc7
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
Location: /v1/accounts/qa-f0e8d639244a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b733afaf-884f-4b80-824c-fbe64e202729","handle":"qa-f0e8d639244a","displayName":"QA f0e8d639244a","region":"eu","role":"user","createdAt":"2026-11-21T09:57:08.397750760Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-f101c955-b22b-4b0f-8dfa-3809ee3c23f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f101c955-b22b-4b0f-8dfa-3809ee3c23f4
Content-Type: application/json

--- request body ---
{"handle":"qa-cc90a5566597","password":"****"}

--- response: 200 in 43 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-f101c955-b22b-4b0f-8dfa-3809ee3c23f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 591
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_81fcd86c-7518-4e0a-831d-537ad28ad018"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3756ce3a-0aaa-455a-98ad-12809a60f5f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3756ce3a-0aaa-455a-98ad-12809a60f5f8
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f0e8d639244a","subject":"Contract check","message":"Hello"}

--- response: 201 in 72 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3756ce3a-0aaa-455a-98ad-12809a60f5f8
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
Location: /v1/conversations/cnv_e6951708-ad36-4723-ba27-6bba8cb78651
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e6951708-ad36-4723-ba27-6bba8cb78651","subject":"Contract check","status":"open","region":"eu","participants":["qa-cc90a5566597","qa-f0e8d639244a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:08.600871822Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-9161dc17-aaa4-4ee4-b3bb-a41cc09aa0f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9161dc17-aaa4-4ee4-b3bb-a41cc09aa0f8
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-9161dc17-aaa4-4ee4-b3bb-a41cc09aa0f8
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
Content-Length: 259

{"items":[{"id":"cnv_e6951708-ad36-4723-ba27-6bba8cb78651","subject":"Contract check","status":"open","region":"eu","participants":["qa-cc90a5566597","qa-f0e8d639244a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:08.600871822Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_e6951708-ad36-4723-ba27-6bba8cb78651
correlation: qa-3e635499-7140-4092-859b-6df329c4b822

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e635499-7140-4092-859b-6df329c4b822
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e635499-7140-4092-859b-6df329c4b822
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_e6951708-ad36-4723-ba27-6bba8cb78651","subject":"Contract check","status":"open","region":"eu","participants":["qa-cc90a5566597","qa-f0e8d639244a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:08.600871822Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_e6951708-ad36-4723-ba27-6bba8cb78651/messages
correlation: qa-16279918-6ae2-4a00-81a7-511e1e597302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16279918-6ae2-4a00-81a7-511e1e597302
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-16279918-6ae2-4a00-81a7-511e1e597302
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
Content-Length: 197

{"id":"msg_72ca07f3-429a-44a4-ae23-7c6a1dbd7f0c","conversationId":"cnv_e6951708-ad36-4723-ba27-6bba8cb78651","sender":"qa-cc90a5566597","body":"Second","createdAt":"2026-11-21T09:57:08.761025403Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_e6951708-ad36-4723-ba27-6bba8cb78651/messages
correlation: qa-578527b2-a605-4f5d-bc28-296c9aa923f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-578527b2-a605-4f5d-bc28-296c9aa923f0
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-578527b2-a605-4f5d-bc28-296c9aa923f0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 416

{"items":[{"id":"msg_bf166ce6-8d11-4429-afbe-cf0a669dcb2d","conversationId":"cnv_e6951708-ad36-4723-ba27-6bba8cb78651","sender":"qa-cc90a5566597","body":"Hello","createdAt":"2026-11-21T09:57:08.601337420Z"},{"id":"msg_72ca07f3-429a-44a4-ae23-7c6a1dbd7f0c","conversationId":"cnv_e6951708-ad36-4723-ba27-6bba8cb78651","sender":"qa-cc90a5566597","body":"Second","createdAt":"2026-11-21T09:57:08.761025403Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-131376f9-4e00-43ac-ba15-7b1a36e8eec1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-131376f9-4e00-43ac-ba15-7b1a36e8eec1
Content-Type: application/json

--- request body ---
{"handle":"qa-f0e8d639244a","password":"****"}

--- response: 200 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-131376f9-4e00-43ac-ba15-7b1a36e8eec1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b733afaf-884f-4b80-824c-fbe64e202729"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_e6951708-ad36-4723-ba27-6bba8cb78651/read
correlation: qa-de18e045-a0af-411f-8461-c54f9e1e06e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de18e045-a0af-411f-8461-c54f9e1e06e8
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/json
X-Correlation-Id: qa-de18e045-a0af-411f-8461-c54f9e1e06e8
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
Content-Length: 77

{"conversationId":"cnv_e6951708-ad36-4723-ba27-6bba8cb78651","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3f2c681f-86d6-43fc-a34d-0bfb103c01e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f2c681f-86d6-43fc-a34d-0bfb103c01e8
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3f2c681f-86d6-43fc-a34d-0bfb103c01e8
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-72f90772-319f-47b7-88d7-bb3b2018e40a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72f90772-319f-47b7-88d7-bb3b2018e40a
Content-Type: application/json

--- request body ---
{"handle":"qa-f0e8d639244a","password":"****"}

--- response: 401 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-72f90772-319f-47b7-88d7-bb3b2018e40a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-72f90772-319f-47b7-88d7-bb3b2018e40a"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-895094e6-dd5f-49a3-92ce-adfdc19c48ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-895094e6-dd5f-49a3-92ce-adfdc19c48ad
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-895094e6-dd5f-49a3-92ce-adfdc19c48ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-6fc58052-d77a-4425-b1e4-e25a6ea66301

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fc58052-d77a-4425-b1e4-e25a6ea66301
Content-Type: application/json

--- request body ---
{"handle":"qa-cc90a5566597","password":"****"}

--- response: 401 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fc58052-d77a-4425-b1e4-e25a6ea66301
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 578
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6fc58052-d77a-4425-b1e4-e25a6ea66301"}
```
