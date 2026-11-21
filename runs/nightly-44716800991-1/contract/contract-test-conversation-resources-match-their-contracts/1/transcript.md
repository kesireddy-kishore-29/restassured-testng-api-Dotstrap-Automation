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
| 1 | `POST /v1/accounts` | 201 | 485 | `qa-3d0d8d9c-0cf4-429c-a9df-7d6852a7e34d` |
| 2 | `POST /v1/accounts` | 201 | 62 | `qa-1359490b-9613-4003-b504-24de00382adc` |
| 3 | `POST /v1/auth/token` | 200 | 49 | `qa-6a168fad-9bfb-4ef0-bce7-d71fda47fe73` |
| 4 | `POST /v1/conversations` | 201 | 47 | `qa-9cfb6e05-9726-4c79-9de7-9f023af70fc9` |
| 5 | `GET /v1/conversations` | 200 | 33 | `qa-a3c6f0c8-e76c-4333-9cf1-6c0ac0097e7f` |
| 6 | `GET /v1/conversations/{id}` | 200 | 26 | `qa-ccf11034-250d-4a7b-b23c-30724bbbc5be` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 31 | `qa-f68918bf-4bfb-40b7-8e74-5505cdd9e052` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 22 | `qa-34839fc8-f434-4069-bab3-2d7cbfd9a8ee` |
| 9 | `POST /v1/auth/token` | 200 | 25 | `qa-404b83eb-cc2f-4347-8568-6b061dc5c8c4` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 22 | `qa-52a47077-963e-4773-9a62-fd152a531cb0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-eb405e45-250a-4b90-91b3-8102f94c4f32` |
| 12 | `POST /v1/auth/token` | 401 | 19 | `qa-962d068c-6938-4fcd-86b9-29a0978b3b82` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-80c1887c-6a15-4315-b49e-e3f40e2d425b` |
| 14 | `POST /v1/auth/token` | 401 | 5 | `qa-4d7837df-1b35-41fa-878e-34ad6d989ed7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3d0d8d9c-0cf4-429c-a9df-7d6852a7e34d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d0d8d9c-0cf4-429c-a9df-7d6852a7e34d
Content-Type: application/json

--- request body ---
{"handle":"qa-6f3614a755f5","displayName":"QA 6f3614a755f5","password":"****","region":"eu"}

--- response: 201 in 485 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-3d0d8d9c-0cf4-429c-a9df-7d6852a7e34d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Location: /v1/accounts/qa-6f3614a755f5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_02cce7f3-d58c-4ec2-87fd-9d9e63d16026","handle":"qa-6f3614a755f5","displayName":"QA 6f3614a755f5","region":"eu","role":"user","createdAt":"2026-11-20T10:09:59.318748551Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1359490b-9613-4003-b504-24de00382adc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1359490b-9613-4003-b504-24de00382adc
Content-Type: application/json

--- request body ---
{"handle":"qa-b483bcf74916","displayName":"QA b483bcf74916","password":"****","region":"eu"}

--- response: 201 in 62 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-1359490b-9613-4003-b504-24de00382adc
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
Location: /v1/accounts/qa-b483bcf74916
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bddc7129-8794-4b52-8c5b-65f11bf19104","handle":"qa-b483bcf74916","displayName":"QA b483bcf74916","region":"eu","role":"user","createdAt":"2026-11-20T10:09:59.709622938Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-6a168fad-9bfb-4ef0-bce7-d71fda47fe73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a168fad-9bfb-4ef0-bce7-d71fda47fe73
Content-Type: application/json

--- request body ---
{"handle":"qa-6f3614a755f5","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a168fad-9bfb-4ef0-bce7-d71fda47fe73
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_02cce7f3-d58c-4ec2-87fd-9d9e63d16026"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9cfb6e05-9726-4c79-9de7-9f023af70fc9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9cfb6e05-9726-4c79-9de7-9f023af70fc9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b483bcf74916","subject":"Contract check","message":"Hello"}

--- response: 201 in 47 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-9cfb6e05-9726-4c79-9de7-9f023af70fc9
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
Location: /v1/conversations/cnv_00022c58-6199-4f66-b525-ea714ede049f
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_00022c58-6199-4f66-b525-ea714ede049f","subject":"Contract check","status":"open","region":"eu","participants":["qa-6f3614a755f5","qa-b483bcf74916"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:09:59.867193147Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-a3c6f0c8-e76c-4333-9cf1-6c0ac0097e7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3c6f0c8-e76c-4333-9cf1-6c0ac0097e7f
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Fri, 20 Nov 2026 10:09:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3c6f0c8-e76c-4333-9cf1-6c0ac0097e7f
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

{"items":[{"id":"cnv_00022c58-6199-4f66-b525-ea714ede049f","subject":"Contract check","status":"open","region":"eu","participants":["qa-6f3614a755f5","qa-b483bcf74916"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:09:59.867193147Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_00022c58-6199-4f66-b525-ea714ede049f
correlation: qa-ccf11034-250d-4a7b-b23c-30724bbbc5be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccf11034-250d-4a7b-b23c-30724bbbc5be
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccf11034-250d-4a7b-b23c-30724bbbc5be
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

{"id":"cnv_00022c58-6199-4f66-b525-ea714ede049f","subject":"Contract check","status":"open","region":"eu","participants":["qa-6f3614a755f5","qa-b483bcf74916"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-20T10:09:59.867193147Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_00022c58-6199-4f66-b525-ea714ede049f/messages
correlation: qa-f68918bf-4bfb-40b7-8e74-5505cdd9e052

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f68918bf-4bfb-40b7-8e74-5505cdd9e052
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 31 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-f68918bf-4bfb-40b7-8e74-5505cdd9e052
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

{"id":"msg_cc1a3d84-b0d5-428a-bba2-eada681a7870","conversationId":"cnv_00022c58-6199-4f66-b525-ea714ede049f","sender":"qa-6f3614a755f5","body":"Second","createdAt":"2026-11-20T10:10:00.092276753Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_00022c58-6199-4f66-b525-ea714ede049f/messages
correlation: qa-34839fc8-f434-4069-bab3-2d7cbfd9a8ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34839fc8-f434-4069-bab3-2d7cbfd9a8ee
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-34839fc8-f434-4069-bab3-2d7cbfd9a8ee
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

{"items":[{"id":"msg_511465f4-2d09-41e9-a866-a2b9dec4d8ce","conversationId":"cnv_00022c58-6199-4f66-b525-ea714ede049f","sender":"qa-6f3614a755f5","body":"Hello","createdAt":"2026-11-20T10:09:59.867477130Z"},{"id":"msg_cc1a3d84-b0d5-428a-bba2-eada681a7870","conversationId":"cnv_00022c58-6199-4f66-b525-ea714ede049f","sender":"qa-6f3614a755f5","body":"Second","createdAt":"2026-11-20T10:10:00.092276753Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-404b83eb-cc2f-4347-8568-6b061dc5c8c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-404b83eb-cc2f-4347-8568-6b061dc5c8c4
Content-Type: application/json

--- request body ---
{"handle":"qa-b483bcf74916","password":"****"}

--- response: 200 in 25 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-404b83eb-cc2f-4347-8568-6b061dc5c8c4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bddc7129-8794-4b52-8c5b-65f11bf19104"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_00022c58-6199-4f66-b525-ea714ede049f/read
correlation: qa-52a47077-963e-4773-9a62-fd152a531cb0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52a47077-963e-4773-9a62-fd152a531cb0
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-52a47077-963e-4773-9a62-fd152a531cb0
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

{"conversationId":"cnv_00022c58-6199-4f66-b525-ea714ede049f","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb405e45-250a-4b90-91b3-8102f94c4f32

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb405e45-250a-4b90-91b3-8102f94c4f32
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb405e45-250a-4b90-91b3-8102f94c4f32
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
correlation: qa-962d068c-6938-4fcd-86b9-29a0978b3b82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-962d068c-6938-4fcd-86b9-29a0978b3b82
Content-Type: application/json

--- request body ---
{"handle":"qa-b483bcf74916","password":"****"}

--- response: 401 in 19 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-962d068c-6938-4fcd-86b9-29a0978b3b82
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-962d068c-6938-4fcd-86b9-29a0978b3b82"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-80c1887c-6a15-4315-b49e-e3f40e2d425b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80c1887c-6a15-4315-b49e-e3f40e2d425b
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-80c1887c-6a15-4315-b49e-e3f40e2d425b
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
correlation: qa-4d7837df-1b35-41fa-878e-34ad6d989ed7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d7837df-1b35-41fa-878e-34ad6d989ed7
Content-Type: application/json

--- request body ---
{"handle":"qa-6f3614a755f5","password":"****"}

--- response: 401 in 5 ms ---
Date: Fri, 20 Nov 2026 10:10:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d7837df-1b35-41fa-878e-34ad6d989ed7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4d7837df-1b35-41fa-878e-34ad6d989ed7"}
```
