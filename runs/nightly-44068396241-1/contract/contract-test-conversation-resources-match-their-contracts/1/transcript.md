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
| 1 | `POST /v1/accounts` | 201 | 328 | `qa-0eab6e02-e30b-470f-98ef-19445f2ddc06` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-fc7d7f5a-7d79-4ca8-bda3-7dc07289d8fe` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-b724be23-4fbe-44ed-b8c2-b699ed7be0f7` |
| 4 | `POST /v1/conversations` | 201 | 48 | `qa-3da59854-bb76-425b-9930-33a8e4e410c7` |
| 5 | `GET /v1/conversations` | 200 | 30 | `qa-2ac343a2-caef-4f5c-80cf-5a8976f52678` |
| 6 | `GET /v1/conversations/{id}` | 200 | 20 | `qa-6ed8ea04-024e-448b-a25f-bdcc3fc5be0a` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 24 | `qa-4a0d7a3e-4783-418f-adad-73622b9e0c83` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 8 | `qa-fc9b143b-c817-49b0-8f6d-22c681601f8c` |
| 9 | `POST /v1/auth/token` | 200 | 12 | `qa-0c43a056-6be2-465b-8c8e-fad97e06d18e` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 10 | `qa-9f899793-77c0-4778-b2b9-5560df862804` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5f4f083c-4606-4a9b-ac35-cf87ad08311e` |
| 12 | `POST /v1/auth/token` | 401 | 12 | `qa-9dde533b-1ce5-40ba-a616-67322076e6bc` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-94114c99-1ff9-41bc-a956-bc626b9d49ea` |
| 14 | `POST /v1/auth/token` | 401 | 14 | `qa-04c34cdd-9ea1-4db4-929b-5cfc9b7177f4` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0eab6e02-e30b-470f-98ef-19445f2ddc06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eab6e02-e30b-470f-98ef-19445f2ddc06
Content-Type: application/json

--- request body ---
{"handle":"qa-f4792300a152","displayName":"QA f4792300a152","password":"****","region":"eu"}

--- response: 201 in 328 ms ---
Date: Tue, 17 Nov 2026 10:50:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-0eab6e02-e30b-470f-98ef-19445f2ddc06
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
Location: /v1/accounts/qa-f4792300a152
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0f69bca6-ba65-4b7e-8f01-71b9280c41da","handle":"qa-f4792300a152","displayName":"QA f4792300a152","region":"eu","role":"user","createdAt":"2026-11-17T10:50:16.793441169Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fc7d7f5a-7d79-4ca8-bda3-7dc07289d8fe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc7d7f5a-7d79-4ca8-bda3-7dc07289d8fe
Content-Type: application/json

--- request body ---
{"handle":"qa-b5aaf72dad79","displayName":"QA b5aaf72dad79","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc7d7f5a-7d79-4ca8-bda3-7dc07289d8fe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 593
RateLimit-Reset: 10
Location: /v1/accounts/qa-b5aaf72dad79
X-Served-Region: eu
Content-Length: 181

{"id":"acc_113ca275-6957-4bdb-b8e0-0551f3246493","handle":"qa-b5aaf72dad79","displayName":"QA b5aaf72dad79","region":"eu","role":"user","createdAt":"2026-11-17T10:50:17.098231587Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b724be23-4fbe-44ed-b8c2-b699ed7be0f7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b724be23-4fbe-44ed-b8c2-b699ed7be0f7
Content-Type: application/json

--- request body ---
{"handle":"qa-f4792300a152","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-b724be23-4fbe-44ed-b8c2-b699ed7be0f7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 590
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0f69bca6-ba65-4b7e-8f01-71b9280c41da"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3da59854-bb76-425b-9930-33a8e4e410c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3da59854-bb76-425b-9930-33a8e4e410c7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b5aaf72dad79","subject":"Contract check","message":"Hello"}

--- response: 201 in 48 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-3da59854-bb76-425b-9930-33a8e4e410c7
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
Location: /v1/conversations/cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57","subject":"Contract check","status":"open","region":"eu","participants":["qa-f4792300a152","qa-b5aaf72dad79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.207619440Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-2ac343a2-caef-4f5c-80cf-5a8976f52678

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ac343a2-caef-4f5c-80cf-5a8976f52678
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-2ac343a2-caef-4f5c-80cf-5a8976f52678
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

{"items":[{"id":"cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57","subject":"Contract check","status":"open","region":"eu","participants":["qa-f4792300a152","qa-b5aaf72dad79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.207619440Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57
correlation: qa-6ed8ea04-024e-448b-a25f-bdcc3fc5be0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ed8ea04-024e-448b-a25f-bdcc3fc5be0a
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ed8ea04-024e-448b-a25f-bdcc3fc5be0a
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

{"id":"cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57","subject":"Contract check","status":"open","region":"eu","participants":["qa-f4792300a152","qa-b5aaf72dad79"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-17T10:50:17.207619440Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57/messages
correlation: qa-4a0d7a3e-4783-418f-adad-73622b9e0c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4a0d7a3e-4783-418f-adad-73622b9e0c83
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 24 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-4a0d7a3e-4783-418f-adad-73622b9e0c83
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

{"id":"msg_5190cf3f-448f-4085-a43f-be6c585aa0df","conversationId":"cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57","sender":"qa-f4792300a152","body":"Second","createdAt":"2026-11-17T10:50:17.386075493Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57/messages
correlation: qa-fc9b143b-c817-49b0-8f6d-22c681601f8c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc9b143b-c817-49b0-8f6d-22c681601f8c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc9b143b-c817-49b0-8f6d-22c681601f8c
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

{"items":[{"id":"msg_729ba970-adb8-4d46-8fec-94d131e277e6","conversationId":"cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57","sender":"qa-f4792300a152","body":"Hello","createdAt":"2026-11-17T10:50:17.207857904Z"},{"id":"msg_5190cf3f-448f-4085-a43f-be6c585aa0df","conversationId":"cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57","sender":"qa-f4792300a152","body":"Second","createdAt":"2026-11-17T10:50:17.386075493Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-0c43a056-6be2-465b-8c8e-fad97e06d18e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c43a056-6be2-465b-8c8e-fad97e06d18e
Content-Type: application/json

--- request body ---
{"handle":"qa-b5aaf72dad79","password":"****"}

--- response: 200 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c43a056-6be2-465b-8c8e-fad97e06d18e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_113ca275-6957-4bdb-b8e0-0551f3246493"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57/read
correlation: qa-9f899793-77c0-4778-b2b9-5560df862804

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f899793-77c0-4778-b2b9-5560df862804
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f899793-77c0-4778-b2b9-5560df862804
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

{"conversationId":"cnv_3967b4ab-aeb0-4459-9cf3-a4646df52e57","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5f4f083c-4606-4a9b-ac35-cf87ad08311e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5f4f083c-4606-4a9b-ac35-cf87ad08311e
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5f4f083c-4606-4a9b-ac35-cf87ad08311e
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
correlation: qa-9dde533b-1ce5-40ba-a616-67322076e6bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9dde533b-1ce5-40ba-a616-67322076e6bc
Content-Type: application/json

--- request body ---
{"handle":"qa-b5aaf72dad79","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9dde533b-1ce5-40ba-a616-67322076e6bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9dde533b-1ce5-40ba-a616-67322076e6bc"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-94114c99-1ff9-41bc-a956-bc626b9d49ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94114c99-1ff9-41bc-a956-bc626b9d49ea
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: text/plain
X-Correlation-Id: qa-94114c99-1ff9-41bc-a956-bc626b9d49ea
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
correlation: qa-04c34cdd-9ea1-4db4-929b-5cfc9b7177f4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-04c34cdd-9ea1-4db4-929b-5cfc9b7177f4
Content-Type: application/json

--- request body ---
{"handle":"qa-f4792300a152","password":"****"}

--- response: 401 in 14 ms ---
Date: Tue, 17 Nov 2026 10:50:17 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-04c34cdd-9ea1-4db4-929b-5cfc9b7177f4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 580
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-04c34cdd-9ea1-4db4-929b-5cfc9b7177f4"}
```
