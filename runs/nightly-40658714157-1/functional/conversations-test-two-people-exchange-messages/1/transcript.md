# Transcript: Two people start a conversation and exchange messages

| | |
|---|---|
| Test | `com.qaautomation.tests.functional.ConversationsTest#twoPeopleExchangeMessages` |
| Features | FEAT-CONV-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 11 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 417 | `qa-5cd9c060-ea67-4063-9dff-c8a72ee98135` |
| 2 | `POST /v1/accounts` | 201 | 77 | `qa-fb241d62-1c69-4f16-b2a0-395bb20f24be` |
| 3 | `POST /v1/auth/token` | 200 | 43 | `qa-52918399-b1ad-41d6-9c8c-eec91d36a59f` |
| 4 | `POST /v1/conversations` | 201 | 78 | `qa-ae112014-8cee-46ba-b7b7-fe6d7bf8bd84` |
| 5 | `POST /v1/auth/token` | 200 | 24 | `qa-ae9cc59b-7085-4b97-9f3c-2e2b30b037aa` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 53 | `qa-ec1f15a0-0042-49ed-b750-a0550dbb1c27` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 25 | `qa-08d59786-a3f1-4d1f-93ea-be1f85ef081a` |
| 8 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-51d6a0a5-7aa6-4f9b-b034-d112e410c40a` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-9ac394c9-f0d5-4e58-b1fd-79dd7d4f0271` |
| 10 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-16e5409c-811c-4da9-b0f0-91e6e9a7f00a` |
| 11 | `POST /v1/auth/token` | 401 | 12 | `qa-d1cef2f6-9c17-4e5c-af8f-08c7f3a676c7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-5cd9c060-ea67-4063-9dff-c8a72ee98135

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5cd9c060-ea67-4063-9dff-c8a72ee98135
Content-Type: application/json

--- request body ---
{"handle":"qa-4b77a7440020","displayName":"QA 4b77a7440020","password":"****","region":"eu"}

--- response: 201 in 417 ms ---
Date: Wed, 28 Oct 2026 08:43:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-5cd9c060-ea67-4063-9dff-c8a72ee98135
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
Location: /v1/accounts/qa-4b77a7440020
X-Served-Region: eu
Content-Length: 181

{"id":"acc_22d55ae1-fdce-4275-8121-b1ea27fbc0d7","handle":"qa-4b77a7440020","displayName":"QA 4b77a7440020","region":"eu","role":"user","createdAt":"2026-10-28T08:43:03.554195930Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-fb241d62-1c69-4f16-b2a0-395bb20f24be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fb241d62-1c69-4f16-b2a0-395bb20f24be
Content-Type: application/json

--- request body ---
{"handle":"qa-6659bd33c3ab","displayName":"QA 6659bd33c3ab","password":"****","region":"eu"}

--- response: 201 in 77 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-fb241d62-1c69-4f16-b2a0-395bb20f24be
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
Location: /v1/accounts/qa-6659bd33c3ab
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ed535414-5245-4ad0-9923-8bcd68a98aaa","handle":"qa-6659bd33c3ab","displayName":"QA 6659bd33c3ab","region":"eu","role":"user","createdAt":"2026-10-28T08:43:04.048512259Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-52918399-b1ad-41d6-9c8c-eec91d36a59f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52918399-b1ad-41d6-9c8c-eec91d36a59f
Content-Type: application/json

--- request body ---
{"handle":"qa-4b77a7440020","password":"****"}

--- response: 200 in 43 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-52918399-b1ad-41d6-9c8c-eec91d36a59f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_22d55ae1-fdce-4275-8121-b1ea27fbc0d7"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ae112014-8cee-46ba-b7b7-fe6d7bf8bd84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae112014-8cee-46ba-b7b7-fe6d7bf8bd84
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-6659bd33c3ab","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 78 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae112014-8cee-46ba-b7b7-fe6d7bf8bd84
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
Location: /v1/conversations/cnv_4b287be6-1078-4e43-9c34-7e3a213ca942
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_4b287be6-1078-4e43-9c34-7e3a213ca942","subject":"Lunch?","status":"open","region":"eu","participants":["qa-4b77a7440020","qa-6659bd33c3ab"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-28T08:43:04.214837509Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-ae9cc59b-7085-4b97-9f3c-2e2b30b037aa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ae9cc59b-7085-4b97-9f3c-2e2b30b037aa
Content-Type: application/json

--- request body ---
{"handle":"qa-6659bd33c3ab","password":"****"}

--- response: 200 in 24 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ae9cc59b-7085-4b97-9f3c-2e2b30b037aa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ed535414-5245-4ad0-9923-8bcd68a98aaa"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_4b287be6-1078-4e43-9c34-7e3a213ca942/messages
correlation: qa-ec1f15a0-0042-49ed-b750-a0550dbb1c27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ec1f15a0-0042-49ed-b750-a0550dbb1c27
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 53 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-ec1f15a0-0042-49ed-b750-a0550dbb1c27
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
Content-Length: 203

{"id":"msg_de87c081-f8ae-44e9-98d9-8a70fad2a892","conversationId":"cnv_4b287be6-1078-4e43-9c34-7e3a213ca942","sender":"qa-6659bd33c3ab","body":"Friday works","createdAt":"2026-10-28T08:43:04.403416423Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_4b287be6-1078-4e43-9c34-7e3a213ca942/messages
correlation: qa-08d59786-a3f1-4d1f-93ea-be1f85ef081a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08d59786-a3f1-4d1f-93ea-be1f85ef081a
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/json
X-Correlation-Id: qa-08d59786-a3f1-4d1f-93ea-be1f85ef081a
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
Content-Length: 432

{"items":[{"id":"msg_1f5e8aa1-8be1-4981-93a2-74f3e79a795d","conversationId":"cnv_4b287be6-1078-4e43-9c34-7e3a213ca942","sender":"qa-4b77a7440020","body":"Free on Friday?","createdAt":"2026-10-28T08:43:04.215112084Z"},{"id":"msg_de87c081-f8ae-44e9-98d9-8a70fad2a892","conversationId":"cnv_4b287be6-1078-4e43-9c34-7e3a213ca942","sender":"qa-6659bd33c3ab","body":"Friday works","createdAt":"2026-10-28T08:43:04.403416423Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-51d6a0a5-7aa6-4f9b-b034-d112e410c40a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51d6a0a5-7aa6-4f9b-b034-d112e410c40a
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-51d6a0a5-7aa6-4f9b-b034-d112e410c40a
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
correlation: qa-9ac394c9-f0d5-4e58-b1fd-79dd7d4f0271

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac394c9-f0d5-4e58-b1fd-79dd7d4f0271
Content-Type: application/json

--- request body ---
{"handle":"qa-6659bd33c3ab","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9ac394c9-f0d5-4e58-b1fd-79dd7d4f0271
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9ac394c9-f0d5-4e58-b1fd-79dd7d4f0271"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-16e5409c-811c-4da9-b0f0-91e6e9a7f00a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16e5409c-811c-4da9-b0f0-91e6e9a7f00a
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: text/plain
X-Correlation-Id: qa-16e5409c-811c-4da9-b0f0-91e6e9a7f00a
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-d1cef2f6-9c17-4e5c-af8f-08c7f3a676c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d1cef2f6-9c17-4e5c-af8f-08c7f3a676c7
Content-Type: application/json

--- request body ---
{"handle":"qa-4b77a7440020","password":"****"}

--- response: 401 in 12 ms ---
Date: Wed, 28 Oct 2026 08:43:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d1cef2f6-9c17-4e5c-af8f-08c7f3a676c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 583
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d1cef2f6-9c17-4e5c-af8f-08c7f3a676c7"}
```
