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
| 1 | `POST /v1/accounts` | 201 | 429 | `qa-a984bfc0-1a7b-4439-83d4-eb1096ba460d` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-50704f78-5e92-4b87-b23d-8e0fafc80b13` |
| 3 | `POST /v1/auth/token` | 200 | 53 | `qa-506a5e67-d155-4828-8520-048497320000` |
| 4 | `POST /v1/conversations` | 201 | 91 | `qa-d27a791e-840a-4e3e-ad3c-75cb1e3c4373` |
| 5 | `POST /v1/auth/token` | 200 | 28 | `qa-1e9e185a-9920-428a-a56a-caae084f4371` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 33 | `qa-72db7f15-4e81-4db4-92bc-e26185c46907` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 29 | `qa-da8a8538-52d3-45c2-8dd3-bcdb12460eb8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e21e10e6-5222-4dcd-a7bb-030c61bd5151` |
| 9 | `POST /v1/auth/token` | 401 | 15 | `qa-5c83b305-bd02-48fa-9a38-9e07c925a6f2` |
| 10 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-e7a1ae76-5bdd-419c-a5c4-ab7023e78127` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-1f9c0866-296a-491c-b5f4-21d515796c77` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-a984bfc0-1a7b-4439-83d4-eb1096ba460d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a984bfc0-1a7b-4439-83d4-eb1096ba460d
Content-Type: application/json

--- request body ---
{"handle":"qa-32cc51de1ec1","displayName":"QA 32cc51de1ec1","password":"****","region":"eu"}

--- response: 201 in 429 ms ---
Date: Tue, 03 Nov 2026 09:41:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-a984bfc0-1a7b-4439-83d4-eb1096ba460d
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
Location: /v1/accounts/qa-32cc51de1ec1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6e92a87-dc4d-419f-ae43-83aa7efb0ae5","handle":"qa-32cc51de1ec1","displayName":"QA 32cc51de1ec1","region":"eu","role":"user","createdAt":"2026-11-03T09:41:44.498941016Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50704f78-5e92-4b87-b23d-8e0fafc80b13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50704f78-5e92-4b87-b23d-8e0fafc80b13
Content-Type: application/json

--- request body ---
{"handle":"qa-803e566f01a0","displayName":"QA 803e566f01a0","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-50704f78-5e92-4b87-b23d-8e0fafc80b13
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
Location: /v1/accounts/qa-803e566f01a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4035027b-da42-4f6b-b8d5-3b2af5268b42","handle":"qa-803e566f01a0","displayName":"QA 803e566f01a0","region":"eu","role":"user","createdAt":"2026-11-03T09:41:45.035395895Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-506a5e67-d155-4828-8520-048497320000

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-506a5e67-d155-4828-8520-048497320000
Content-Type: application/json

--- request body ---
{"handle":"qa-32cc51de1ec1","password":"****"}

--- response: 200 in 53 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-506a5e67-d155-4828-8520-048497320000
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6e92a87-dc4d-419f-ae43-83aa7efb0ae5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d27a791e-840a-4e3e-ad3c-75cb1e3c4373

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d27a791e-840a-4e3e-ad3c-75cb1e3c4373
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-803e566f01a0","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 91 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d27a791e-840a-4e3e-ad3c-75cb1e3c4373
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
Location: /v1/conversations/cnv_a185d2ff-7cdf-4a49-bdf5-80657c48f257
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_a185d2ff-7cdf-4a49-bdf5-80657c48f257","subject":"Lunch?","status":"open","region":"eu","participants":["qa-32cc51de1ec1","qa-803e566f01a0"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:45.217311209Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-1e9e185a-9920-428a-a56a-caae084f4371

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e9e185a-9920-428a-a56a-caae084f4371
Content-Type: application/json

--- request body ---
{"handle":"qa-803e566f01a0","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e9e185a-9920-428a-a56a-caae084f4371
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4035027b-da42-4f6b-b8d5-3b2af5268b42"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_a185d2ff-7cdf-4a49-bdf5-80657c48f257/messages
correlation: qa-72db7f15-4e81-4db4-92bc-e26185c46907

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-72db7f15-4e81-4db4-92bc-e26185c46907
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 33 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-72db7f15-4e81-4db4-92bc-e26185c46907
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

{"id":"msg_de8055e2-969d-4746-a244-28cf6f1e18fb","conversationId":"cnv_a185d2ff-7cdf-4a49-bdf5-80657c48f257","sender":"qa-803e566f01a0","body":"Friday works","createdAt":"2026-11-03T09:41:45.393030289Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_a185d2ff-7cdf-4a49-bdf5-80657c48f257/messages
correlation: qa-da8a8538-52d3-45c2-8dd3-bcdb12460eb8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da8a8538-52d3-45c2-8dd3-bcdb12460eb8
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-da8a8538-52d3-45c2-8dd3-bcdb12460eb8
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

{"items":[{"id":"msg_4b3cff87-86cd-405f-a090-c4248f6c6ac4","conversationId":"cnv_a185d2ff-7cdf-4a49-bdf5-80657c48f257","sender":"qa-32cc51de1ec1","body":"Free on Friday?","createdAt":"2026-11-03T09:41:45.217591890Z"},{"id":"msg_de8055e2-969d-4746-a244-28cf6f1e18fb","conversationId":"cnv_a185d2ff-7cdf-4a49-bdf5-80657c48f257","sender":"qa-803e566f01a0","body":"Friday works","createdAt":"2026-11-03T09:41:45.393030289Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e21e10e6-5222-4dcd-a7bb-030c61bd5151

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e21e10e6-5222-4dcd-a7bb-030c61bd5151
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e21e10e6-5222-4dcd-a7bb-030c61bd5151
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
correlation: qa-5c83b305-bd02-48fa-9a38-9e07c925a6f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c83b305-bd02-48fa-9a38-9e07c925a6f2
Content-Type: application/json

--- request body ---
{"handle":"qa-803e566f01a0","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5c83b305-bd02-48fa-9a38-9e07c925a6f2
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5c83b305-bd02-48fa-9a38-9e07c925a6f2"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7a1ae76-5bdd-419c-a5c4-ab7023e78127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7a1ae76-5bdd-419c-a5c4-ab7023e78127
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7a1ae76-5bdd-419c-a5c4-ab7023e78127
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
correlation: qa-1f9c0866-296a-491c-b5f4-21d515796c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f9c0866-296a-491c-b5f4-21d515796c77
Content-Type: application/json

--- request body ---
{"handle":"qa-32cc51de1ec1","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1f9c0866-296a-491c-b5f4-21d515796c77
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1f9c0866-296a-491c-b5f4-21d515796c77"}
```
