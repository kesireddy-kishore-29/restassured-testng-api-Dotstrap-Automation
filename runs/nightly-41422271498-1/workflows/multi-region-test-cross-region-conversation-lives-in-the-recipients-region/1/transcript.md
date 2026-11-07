# Transcript: A cross-region conversation is stored in the recipient's region, for both sides

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.MultiRegionTest#crossRegionConversationLivesInTheRecipientsRegion` |
| Features | FEAT-REGION-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 376 | `qa-dc227d08-ed33-466b-b0f4-5ee27824a505` |
| 2 | `POST /v1/accounts` | 201 | 58 | `qa-8432d052-8f55-4b24-b2ce-e7836ff92fec` |
| 3 | `POST /v1/auth/token` | 200 | 19 | `qa-68706af1-2868-4379-8575-c42b1d2e56c9` |
| 4 | `POST /v1/conversations` | 201 | 79 | `qa-6aed1129-b03a-41a7-a59d-5b0c545eff0e` |
| 5 | `GET /v1/conversations/{id}` | 200 | 27 | `qa-e9b1671d-d6e4-4067-8a43-469f2a662d58` |
| 6 | `POST /v1/auth/token` | 200 | 14 | `qa-e39d4d5a-5def-4a67-89ae-07571ff2a3a5` |
| 7 | `GET /v1/conversations/{id}` | 200 | 8 | `qa-192d99c7-b800-4dac-b99c-ca5134066e12` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-999bfd25-c0a1-4e8b-9c7d-ccc9c60d4ea1` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-59b93c17-b438-4ac0-ae14-7f39a86b513f` |
| 10 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-30b95ea4-7ae7-4857-8c89-3be67ca9be80` |
| 11 | `POST /v1/auth/token` | 401 | 9 | `qa-957097a6-db04-43a1-8a4d-b388de69c917` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-dc227d08-ed33-466b-b0f4-5ee27824a505

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc227d08-ed33-466b-b0f4-5ee27824a505
Content-Type: application/json

--- request body ---
{"handle":"qa-6d56fcd78077","displayName":"QA 6d56fcd78077","password":"****","region":"in"}

--- response: 201 in 376 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc227d08-ed33-466b-b0f4-5ee27824a505
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
Location: /v1/accounts/qa-6d56fcd78077
X-Served-Region: in
Content-Length: 181

{"id":"acc_b57ada73-a3c2-4c22-a824-75d1e8460b57","handle":"qa-6d56fcd78077","displayName":"QA 6d56fcd78077","region":"in","role":"user","createdAt":"2026-11-02T09:38:48.612870992Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8432d052-8f55-4b24-b2ce-e7836ff92fec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8432d052-8f55-4b24-b2ce-e7836ff92fec
Content-Type: application/json

--- request body ---
{"handle":"qa-9c6b0436e59d","displayName":"QA 9c6b0436e59d","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Mon, 02 Nov 2026 09:38:48 GMT
Content-Type: application/json
X-Correlation-Id: qa-8432d052-8f55-4b24-b2ce-e7836ff92fec
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
Location: /v1/accounts/qa-9c6b0436e59d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a1ac42c8-c613-4581-a864-53204dfac4db","handle":"qa-9c6b0436e59d","displayName":"QA 9c6b0436e59d","region":"eu","role":"user","createdAt":"2026-11-02T09:38:48.993700997Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-68706af1-2868-4379-8575-c42b1d2e56c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-68706af1-2868-4379-8575-c42b1d2e56c9
Content-Type: application/json

--- request body ---
{"handle":"qa-6d56fcd78077","password":"****"}

--- response: 200 in 19 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-68706af1-2868-4379-8575-c42b1d2e56c9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b57ada73-a3c2-4c22-a824-75d1e8460b57"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-6aed1129-b03a-41a7-a59d-5b0c545eff0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aed1129-b03a-41a7-a59d-5b0c545eff0e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9c6b0436e59d","subject":"Across regions","message":"Namaste"}

--- response: 201 in 79 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-6aed1129-b03a-41a7-a59d-5b0c545eff0e
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
X-Served-Region: in
Location: /v1/conversations/cnv_4cc9d143-084a-4da2-97e7-fb90b5f992d4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4cc9d143-084a-4da2-97e7-fb90b5f992d4","subject":"Across regions","status":"open","region":"eu","participants":["qa-6d56fcd78077","qa-9c6b0436e59d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:49.112955418Z"}
```

## 5. GET /v1/conversations/{id}

```text
#5 GET http://localhost:7070/v1/conversations/cnv_4cc9d143-084a-4da2-97e7-fb90b5f992d4
correlation: qa-e9b1671d-d6e4-4067-8a43-469f2a662d58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9b1671d-d6e4-4067-8a43-469f2a662d58
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9b1671d-d6e4-4067-8a43-469f2a662d58
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
X-Served-Region: in
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4cc9d143-084a-4da2-97e7-fb90b5f992d4","subject":"Across regions","status":"open","region":"eu","participants":["qa-6d56fcd78077","qa-9c6b0436e59d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-02T09:38:49.112955418Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-e39d4d5a-5def-4a67-89ae-07571ff2a3a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e39d4d5a-5def-4a67-89ae-07571ff2a3a5
Content-Type: application/json

--- request body ---
{"handle":"qa-9c6b0436e59d","password":"****"}

--- response: 200 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-e39d4d5a-5def-4a67-89ae-07571ff2a3a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 572
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a1ac42c8-c613-4581-a864-53204dfac4db"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4cc9d143-084a-4da2-97e7-fb90b5f992d4
correlation: qa-192d99c7-b800-4dac-b99c-ca5134066e12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-192d99c7-b800-4dac-b99c-ca5134066e12
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-192d99c7-b800-4dac-b99c-ca5134066e12
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
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_4cc9d143-084a-4da2-97e7-fb90b5f992d4","subject":"Across regions","status":"open","region":"eu","participants":["qa-6d56fcd78077","qa-9c6b0436e59d"],"messageCount":1,"unreadCount":1,"createdAt":"2026-11-02T09:38:49.112955418Z"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-999bfd25-c0a1-4e8b-9c7d-ccc9c60d4ea1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-999bfd25-c0a1-4e8b-9c7d-ccc9c60d4ea1
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-999bfd25-c0a1-4e8b-9c7d-ccc9c60d4ea1
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-59b93c17-b438-4ac0-ae14-7f39a86b513f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-59b93c17-b438-4ac0-ae14-7f39a86b513f
Content-Type: application/json

--- request body ---
{"handle":"qa-9c6b0436e59d","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-59b93c17-b438-4ac0-ae14-7f39a86b513f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-59b93c17-b438-4ac0-ae14-7f39a86b513f"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-30b95ea4-7ae7-4857-8c89-3be67ca9be80

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30b95ea4-7ae7-4857-8c89-3be67ca9be80
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: text/plain
X-Correlation-Id: qa-30b95ea4-7ae7-4857-8c89-3be67ca9be80
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
X-Served-Region: in
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-957097a6-db04-43a1-8a4d-b388de69c917

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-957097a6-db04-43a1-8a4d-b388de69c917
Content-Type: application/json

--- request body ---
{"handle":"qa-6d56fcd78077","password":"****"}

--- response: 401 in 9 ms ---
Date: Mon, 02 Nov 2026 09:38:49 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-957097a6-db04-43a1-8a4d-b388de69c917
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-957097a6-db04-43a1-8a4d-b388de69c917"}
```
