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
| 1 | `POST /v1/accounts` | 201 | 459 | `qa-d0bff14f-59ff-479a-8cc3-39e32d795735` |
| 2 | `POST /v1/accounts` | 201 | 31 | `qa-7275e10a-6b51-4149-9be5-fe63ec512f0a` |
| 3 | `POST /v1/auth/token` | 200 | 31 | `qa-00a2d87e-2688-4da4-b894-5901392e743d` |
| 4 | `POST /v1/conversations` | 201 | 58 | `qa-9bee7884-dae2-40a5-ae98-258180a08dd7` |
| 5 | `GET /v1/conversations` | 200 | 41 | `qa-1902d913-88fa-4f24-93c1-59c0de74e5b9` |
| 6 | `GET /v1/conversations/{id}` | 200 | 22 | `qa-94e02ead-9973-4fe1-949d-2588d080c46c` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 49 | `qa-8c8aad8a-303b-43ba-b5bc-c8b38c9f1e7e` |
| 8 | `GET /v1/conversations/{id}/messages` | 200 | 18 | `qa-1e69b5be-5026-4690-bca6-72d525860283` |
| 9 | `POST /v1/auth/token` | 200 | 28 | `qa-31f9d861-6dac-4fc8-ace8-981b83dd088e` |
| 10 | `POST /v1/conversations/{id}/read` | 200 | 14 | `qa-fc51170e-bae1-46f7-9faf-2cfd762375b5` |
| 11 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-7cdb9e88-520a-4eca-9391-f873110a8589` |
| 12 | `POST /v1/auth/token` | 401 | 12 | `qa-749fba85-54d6-47c8-aa93-c8cbb160aac1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-5d7705d0-f48b-441d-92f2-04495615ddc5` |
| 14 | `POST /v1/auth/token` | 401 | 24 | `qa-ee81cbec-5bfe-4d93-9f65-d64466075fd1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d0bff14f-59ff-479a-8cc3-39e32d795735

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0bff14f-59ff-479a-8cc3-39e32d795735
Content-Type: application/json

--- request body ---
{"handle":"qa-33d27ce6c032","displayName":"QA 33d27ce6c032","password":"****","region":"eu"}

--- response: 201 in 459 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0bff14f-59ff-479a-8cc3-39e32d795735
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-33d27ce6c032
X-Served-Region: eu
Content-Length: 181

{"id":"acc_54671576-6d3b-459d-9e01-9ea4c2429779","handle":"qa-33d27ce6c032","displayName":"QA 33d27ce6c032","region":"eu","role":"user","createdAt":"2026-11-26T11:02:42.439930995Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-7275e10a-6b51-4149-9be5-fe63ec512f0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7275e10a-6b51-4149-9be5-fe63ec512f0a
Content-Type: application/json

--- request body ---
{"handle":"qa-d1de88edcb84","displayName":"QA d1de88edcb84","password":"****","region":"eu"}

--- response: 201 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-7275e10a-6b51-4149-9be5-fe63ec512f0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Location: /v1/accounts/qa-d1de88edcb84
X-Served-Region: eu
Content-Length: 181

{"id":"acc_21366729-1368-4a79-8112-4fe3bf0c58c5","handle":"qa-d1de88edcb84","displayName":"QA d1de88edcb84","region":"eu","role":"user","createdAt":"2026-11-26T11:02:42.874241201Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-00a2d87e-2688-4da4-b894-5901392e743d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00a2d87e-2688-4da4-b894-5901392e743d
Content-Type: application/json

--- request body ---
{"handle":"qa-33d27ce6c032","password":"****"}

--- response: 200 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-00a2d87e-2688-4da4-b894-5901392e743d
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_54671576-6d3b-459d-9e01-9ea4c2429779"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9bee7884-dae2-40a5-ae98-258180a08dd7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bee7884-dae2-40a5-ae98-258180a08dd7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-d1de88edcb84","subject":"Contract check","message":"Hello"}

--- response: 201 in 58 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-9bee7884-dae2-40a5-ae98-258180a08dd7
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
Location: /v1/conversations/cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32","subject":"Contract check","status":"open","region":"eu","participants":["qa-33d27ce6c032","qa-d1de88edcb84"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.039064506Z"}
```

## 5. GET /v1/conversations

```text
#5 GET http://localhost:7070/v1/conversations
correlation: qa-1902d913-88fa-4f24-93c1-59c0de74e5b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1902d913-88fa-4f24-93c1-59c0de74e5b9
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1902d913-88fa-4f24-93c1-59c0de74e5b9
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

{"items":[{"id":"cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32","subject":"Contract check","status":"open","region":"eu","participants":["qa-33d27ce6c032","qa-d1de88edcb84"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.039064506Z"}],"total":1}
```

## 6. GET /v1/conversations/{id}

```text
#6 GET http://localhost:7070/v1/conversations/cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32
correlation: qa-94e02ead-9973-4fe1-949d-2588d080c46c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-94e02ead-9973-4fe1-949d-2588d080c46c
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-94e02ead-9973-4fe1-949d-2588d080c46c
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

{"id":"cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32","subject":"Contract check","status":"open","region":"eu","participants":["qa-33d27ce6c032","qa-d1de88edcb84"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:43.039064506Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32/messages
correlation: qa-8c8aad8a-303b-43ba-b5bc-c8b38c9f1e7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c8aad8a-303b-43ba-b5bc-c8b38c9f1e7e
Content-Type: application/json

--- request body ---
{"body":"Second"}

--- response: 201 in 49 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c8aad8a-303b-43ba-b5bc-c8b38c9f1e7e
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

{"id":"msg_2b5751e7-9241-4055-8ae4-4e34639d9c6b","conversationId":"cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32","sender":"qa-33d27ce6c032","body":"Second","createdAt":"2026-11-26T11:02:43.244483620Z"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32/messages
correlation: qa-1e69b5be-5026-4690-bca6-72d525860283

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e69b5be-5026-4690-bca6-72d525860283
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e69b5be-5026-4690-bca6-72d525860283
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

{"items":[{"id":"msg_afaff270-6805-4c6d-a672-fed5d09ddda3","conversationId":"cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32","sender":"qa-33d27ce6c032","body":"Hello","createdAt":"2026-11-26T11:02:43.039288075Z"},{"id":"msg_2b5751e7-9241-4055-8ae4-4e34639d9c6b","conversationId":"cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32","sender":"qa-33d27ce6c032","body":"Second","createdAt":"2026-11-26T11:02:43.244483620Z"}],"total":2}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-31f9d861-6dac-4fc8-ace8-981b83dd088e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31f9d861-6dac-4fc8-ace8-981b83dd088e
Content-Type: application/json

--- request body ---
{"handle":"qa-d1de88edcb84","password":"****"}

--- response: 200 in 28 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-31f9d861-6dac-4fc8-ace8-981b83dd088e
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_21366729-1368-4a79-8112-4fe3bf0c58c5"}
```

## 10. POST /v1/conversations/{id}/read

```text
#10 POST http://localhost:7070/v1/conversations/cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32/read
correlation: qa-fc51170e-bae1-46f7-9faf-2cfd762375b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc51170e-bae1-46f7-9faf-2cfd762375b5
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc51170e-bae1-46f7-9faf-2cfd762375b5
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

{"conversationId":"cnv_30db9eb2-2b49-4216-81ed-fa35f6a0fd32","unreadCount":0}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-7cdb9e88-520a-4eca-9391-f873110a8589

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cdb9e88-520a-4eca-9391-f873110a8589
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-7cdb9e88-520a-4eca-9391-f873110a8589
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
correlation: qa-749fba85-54d6-47c8-aa93-c8cbb160aac1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-749fba85-54d6-47c8-aa93-c8cbb160aac1
Content-Type: application/json

--- request body ---
{"handle":"qa-d1de88edcb84","password":"****"}

--- response: 401 in 12 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-749fba85-54d6-47c8-aa93-c8cbb160aac1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-749fba85-54d6-47c8-aa93-c8cbb160aac1"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5d7705d0-f48b-441d-92f2-04495615ddc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d7705d0-f48b-441d-92f2-04495615ddc5
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5d7705d0-f48b-441d-92f2-04495615ddc5
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
correlation: qa-ee81cbec-5bfe-4d93-9f65-d64466075fd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee81cbec-5bfe-4d93-9f65-d64466075fd1
Content-Type: application/json

--- request body ---
{"handle":"qa-33d27ce6c032","password":"****"}

--- response: 401 in 24 ms ---
Date: Thu, 26 Nov 2026 11:02:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee81cbec-5bfe-4d93-9f65-d64466075fd1
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee81cbec-5bfe-4d93-9f65-d64466075fd1"}
```
