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
| 1 | `POST /v1/accounts` | 201 | 491 | `qa-e292b589-7e26-44b7-9424-31cac4902913` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-665f84ae-b78b-4cb8-bf29-1e3a1d4b9083` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-ed1ba289-c6f3-46a3-b9cb-e1e714be7d13` |
| 4 | `POST /v1/conversations` | 201 | 64 | `qa-0de17737-5405-4f50-88cb-4d677ba6e88f` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 31 | `qa-70f59f1f-2a6b-4b03-ad21-e130a89fae4f` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-64c3cc74-d819-48ea-abf9-df806b3c8705` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 14 | `qa-f94f1b07-8c05-4c09-8624-d03764cb4821` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2529f7fc-b9b2-4bcc-a532-64784f11810f` |
| 9 | `POST /v1/auth/token` | 401 | 5 | `qa-23be42d4-b503-4e43-bc37-70bdad1ad3de` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-82d0abf4-65be-4e14-94f7-7c7f45325a5b` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-2182d02f-cbdc-4b6d-b5bb-340499f4d57e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e292b589-7e26-44b7-9424-31cac4902913

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e292b589-7e26-44b7-9424-31cac4902913
Content-Type: application/json

--- request body ---
{"handle":"qa-2d0ee34c0535","displayName":"QA 2d0ee34c0535","password":"****","region":"eu"}

--- response: 201 in 491 ms ---
Date: Mon, 26 Oct 2026 07:54:41 GMT
Content-Type: application/json
X-Correlation-Id: qa-e292b589-7e26-44b7-9424-31cac4902913
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
Location: /v1/accounts/qa-2d0ee34c0535
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc820525-9bc1-43d1-8580-c21f055b3849","handle":"qa-2d0ee34c0535","displayName":"QA 2d0ee34c0535","region":"eu","role":"user","createdAt":"2026-10-26T07:54:41.748258110Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-665f84ae-b78b-4cb8-bf29-1e3a1d4b9083

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-665f84ae-b78b-4cb8-bf29-1e3a1d4b9083
Content-Type: application/json

--- request body ---
{"handle":"qa-925f8e87be02","displayName":"QA 925f8e87be02","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-665f84ae-b78b-4cb8-bf29-1e3a1d4b9083
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
Location: /v1/accounts/qa-925f8e87be02
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a97b4eee-2c94-43ac-9683-97a32857414f","handle":"qa-925f8e87be02","displayName":"QA 925f8e87be02","region":"eu","role":"user","createdAt":"2026-10-26T07:54:42.214287901Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-ed1ba289-c6f3-46a3-b9cb-e1e714be7d13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ed1ba289-c6f3-46a3-b9cb-e1e714be7d13
Content-Type: application/json

--- request body ---
{"handle":"qa-2d0ee34c0535","password":"****"}

--- response: 200 in 43 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-ed1ba289-c6f3-46a3-b9cb-e1e714be7d13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 592
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc820525-9bc1-43d1-8580-c21f055b3849"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0de17737-5405-4f50-88cb-4d677ba6e88f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0de17737-5405-4f50-88cb-4d677ba6e88f
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-925f8e87be02","subject":"Quick question","message":"Hi"}

--- response: 201 in 64 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-0de17737-5405-4f50-88cb-4d677ba6e88f
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
Location: /v1/conversations/cnv_eaa640f0-8f7b-4911-9b87-721d2bd9d022
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_eaa640f0-8f7b-4911-9b87-721d2bd9d022","subject":"Quick question","status":"open","region":"eu","participants":["qa-2d0ee34c0535","qa-925f8e87be02"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:42.361289183Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_eaa640f0-8f7b-4911-9b87-721d2bd9d022/close
correlation: qa-70f59f1f-2a6b-4b03-ad21-e130a89fae4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70f59f1f-2a6b-4b03-ad21-e130a89fae4f
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-70f59f1f-2a6b-4b03-ad21-e130a89fae4f
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

{"id":"cnv_eaa640f0-8f7b-4911-9b87-721d2bd9d022","subject":"Quick question","status":"closed","region":"eu","participants":["qa-2d0ee34c0535","qa-925f8e87be02"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:42.361289183Z","closedAt":"2026-10-26T07:54:42.501363990Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-64c3cc74-d819-48ea-abf9-df806b3c8705

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64c3cc74-d819-48ea-abf9-df806b3c8705
Content-Type: application/json

--- request body ---
{"handle":"qa-925f8e87be02","password":"****"}

--- response: 200 in 42 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/json
X-Correlation-Id: qa-64c3cc74-d819-48ea-abf9-df806b3c8705
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a97b4eee-2c94-43ac-9683-97a32857414f"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_eaa640f0-8f7b-4911-9b87-721d2bd9d022/messages
correlation: qa-f94f1b07-8c05-4c09-8624-d03764cb4821

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f94f1b07-8c05-4c09-8624-d03764cb4821
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 14 ms ---
Date: Mon, 26 Oct 2026 07:54:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f94f1b07-8c05-4c09-8624-d03764cb4821
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_eaa640f0-8f7b-4911-9b87-721d2bd9d022/messages","correlationId":"qa-f94f1b07-8c05-4c09-8624-d03764cb4821"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2529f7fc-b9b2-4bcc-a532-64784f11810f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2529f7fc-b9b2-4bcc-a532-64784f11810f
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2529f7fc-b9b2-4bcc-a532-64784f11810f
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
correlation: qa-23be42d4-b503-4e43-bc37-70bdad1ad3de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23be42d4-b503-4e43-bc37-70bdad1ad3de
Content-Type: application/json

--- request body ---
{"handle":"qa-925f8e87be02","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23be42d4-b503-4e43-bc37-70bdad1ad3de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23be42d4-b503-4e43-bc37-70bdad1ad3de"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-82d0abf4-65be-4e14-94f7-7c7f45325a5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82d0abf4-65be-4e14-94f7-7c7f45325a5b
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: text/plain
X-Correlation-Id: qa-82d0abf4-65be-4e14-94f7-7c7f45325a5b
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
correlation: qa-2182d02f-cbdc-4b6d-b5bb-340499f4d57e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2182d02f-cbdc-4b6d-b5bb-340499f4d57e
Content-Type: application/json

--- request body ---
{"handle":"qa-2d0ee34c0535","password":"****"}

--- response: 401 in 5 ms ---
Date: Mon, 26 Oct 2026 07:54:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2182d02f-cbdc-4b6d-b5bb-340499f4d57e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 570
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2182d02f-cbdc-4b6d-b5bb-340499f4d57e"}
```
