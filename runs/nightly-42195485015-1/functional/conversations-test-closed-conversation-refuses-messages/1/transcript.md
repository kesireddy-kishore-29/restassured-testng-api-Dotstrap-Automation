# Transcript: A closed conversation refuses new messages with 409

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#closedConversationRefusesMessages` |
| Features | FEAT-CONV-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 446 | `qa-b7bad602-37fc-4d37-86ab-7b47a2ca8ae0` |
| 2 | `POST /v1/accounts` | 201 | 81 | `qa-e282a6c7-300e-45ae-94c0-d20184adc9d0` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-fad11050-27a2-4770-a1b7-59ced7179d20` |
| 4 | `POST /v1/conversations` | 201 | 45 | `qa-e1eb68a3-1ffa-42f1-bdde-4e65034abe8e` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 28 | `qa-57bbf293-69a3-4775-bd96-5c7d15832970` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-37e00810-aafb-41dd-a646-52cc024afe7e` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 23 | `qa-45399048-5f99-428a-82c0-256e62e32039` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-d17b448c-e56c-45c6-b4f9-73bb1b7e0e5d` |
| 9 | `POST /v1/auth/token` | 401 | 7 | `qa-7d6232f6-4466-4bca-86ef-c79a39979531` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-31210e66-d9fd-4729-a893-b863447cdd61` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-27560c26-623b-494b-9a84-eabf35de2c2e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b7bad602-37fc-4d37-86ab-7b47a2ca8ae0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7bad602-37fc-4d37-86ab-7b47a2ca8ae0
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2dfb1cdcfd","displayName":"QA ae2dfb1cdcfd","password":"****","region":"eu"}

--- response: 201 in 446 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7bad602-37fc-4d37-86ab-7b47a2ca8ae0
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
Location: /v1/accounts/qa-ae2dfb1cdcfd
X-Served-Region: eu
Content-Length: 181

{"id":"acc_742a859e-6a90-4901-a797-939f046af40e","handle":"qa-ae2dfb1cdcfd","displayName":"QA ae2dfb1cdcfd","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.047381473Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e282a6c7-300e-45ae-94c0-d20184adc9d0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e282a6c7-300e-45ae-94c0-d20184adc9d0
Content-Type: application/json

--- request body ---
{"handle":"qa-8dfe4067247f","displayName":"QA 8dfe4067247f","password":"****","region":"eu"}

--- response: 201 in 81 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e282a6c7-300e-45ae-94c0-d20184adc9d0
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
Location: /v1/accounts/qa-8dfe4067247f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_72125fda-4695-406e-ab82-a8c3c2d4a722","handle":"qa-8dfe4067247f","displayName":"QA 8dfe4067247f","region":"eu","role":"user","createdAt":"2026-11-06T09:30:32.536692274Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-fad11050-27a2-4770-a1b7-59ced7179d20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fad11050-27a2-4770-a1b7-59ced7179d20
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2dfb1cdcfd","password":"****"}

--- response: 200 in 36 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-fad11050-27a2-4770-a1b7-59ced7179d20
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_742a859e-6a90-4901-a797-939f046af40e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e1eb68a3-1ffa-42f1-bdde-4e65034abe8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1eb68a3-1ffa-42f1-bdde-4e65034abe8e
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8dfe4067247f","subject":"Quick question","message":"Hi"}

--- response: 201 in 45 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1eb68a3-1ffa-42f1-bdde-4e65034abe8e
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
Location: /v1/conversations/cnv_24cdb1f1-389a-4fcd-a35a-7a5b9f83bf58
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_24cdb1f1-389a-4fcd-a35a-7a5b9f83bf58","subject":"Quick question","status":"open","region":"eu","participants":["qa-ae2dfb1cdcfd","qa-8dfe4067247f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:32.685314015Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_24cdb1f1-389a-4fcd-a35a-7a5b9f83bf58/close
correlation: qa-57bbf293-69a3-4775-bd96-5c7d15832970

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57bbf293-69a3-4775-bd96-5c7d15832970
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-57bbf293-69a3-4775-bd96-5c7d15832970
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
Content-Length: 283

{"id":"cnv_24cdb1f1-389a-4fcd-a35a-7a5b9f83bf58","subject":"Quick question","status":"closed","region":"eu","participants":["qa-ae2dfb1cdcfd","qa-8dfe4067247f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:32.685314015Z","closedAt":"2026-11-06T09:30:32.827274499Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-37e00810-aafb-41dd-a646-52cc024afe7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37e00810-aafb-41dd-a646-52cc024afe7e
Content-Type: application/json

--- request body ---
{"handle":"qa-8dfe4067247f","password":"****"}

--- response: 200 in 28 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-37e00810-aafb-41dd-a646-52cc024afe7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 586
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_72125fda-4695-406e-ab82-a8c3c2d4a722"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_24cdb1f1-389a-4fcd-a35a-7a5b9f83bf58/messages
correlation: qa-45399048-5f99-428a-82c0-256e62e32039

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45399048-5f99-428a-82c0-256e62e32039
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 23 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45399048-5f99-428a-82c0-256e62e32039
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
Content-Length: 329

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_24cdb1f1-389a-4fcd-a35a-7a5b9f83bf58/messages","correlationId":"qa-45399048-5f99-428a-82c0-256e62e32039"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d17b448c-e56c-45c6-b4f9-73bb1b7e0e5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d17b448c-e56c-45c6-b4f9-73bb1b7e0e5d
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d17b448c-e56c-45c6-b4f9-73bb1b7e0e5d
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

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-7d6232f6-4466-4bca-86ef-c79a39979531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d6232f6-4466-4bca-86ef-c79a39979531
Content-Type: application/json

--- request body ---
{"handle":"qa-8dfe4067247f","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7d6232f6-4466-4bca-86ef-c79a39979531
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7d6232f6-4466-4bca-86ef-c79a39979531"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-31210e66-d9fd-4729-a893-b863447cdd61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31210e66-d9fd-4729-a893-b863447cdd61
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-31210e66-d9fd-4729-a893-b863447cdd61
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 9
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-27560c26-623b-494b-9a84-eabf35de2c2e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27560c26-623b-494b-9a84-eabf35de2c2e
Content-Type: application/json

--- request body ---
{"handle":"qa-ae2dfb1cdcfd","password":"****"}

--- response: 401 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-27560c26-623b-494b-9a84-eabf35de2c2e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-27560c26-623b-494b-9a84-eabf35de2c2e"}
```
