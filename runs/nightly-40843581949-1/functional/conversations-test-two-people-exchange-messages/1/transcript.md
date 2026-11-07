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
| 1 | `POST /v1/accounts` | 201 | 445 | `qa-ee5bc105-13aa-45c8-bf53-af9b04785e83` |
| 2 | `POST /v1/accounts` | 201 | 41 | `qa-6b4bde8a-a9aa-4504-9b73-2914f8676ff8` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-2b8fc6b1-ddb3-4e0f-96c0-ed704823f2fb` |
| 4 | `POST /v1/conversations` | 201 | 71 | `qa-53bb23d1-4b10-4bc3-b11d-005028f10c6d` |
| 5 | `POST /v1/auth/token` | 200 | 42 | `qa-52950a41-a2e3-4e96-9067-e6fe4b763b28` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 18 | `qa-00a6854d-e224-49f2-b165-ff1f7170ece0` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 23 | `qa-c8e06089-4480-4364-911a-88490ec25ff6` |
| 8 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-d7b7ae38-90a6-4760-9682-7f63b8568060` |
| 9 | `POST /v1/auth/token` | 401 | 10 | `qa-18836371-e838-488b-aa9a-12a608b6aaa7` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-2dbaf4b6-6fcc-4627-bdfa-84c8d9be18e4` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-474176d2-6b70-4d71-b1ad-1e597af3ca8e` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ee5bc105-13aa-45c8-bf53-af9b04785e83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee5bc105-13aa-45c8-bf53-af9b04785e83
Content-Type: application/json

--- request body ---
{"handle":"qa-1d48bfb8502f","displayName":"QA 1d48bfb8502f","password":"****","region":"eu"}

--- response: 201 in 445 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee5bc105-13aa-45c8-bf53-af9b04785e83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-1d48bfb8502f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4100c788-2a2b-47e7-8fd6-480fc6f50bde","handle":"qa-1d48bfb8502f","displayName":"QA 1d48bfb8502f","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.331059660Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6b4bde8a-a9aa-4504-9b73-2914f8676ff8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6b4bde8a-a9aa-4504-9b73-2914f8676ff8
Content-Type: application/json

--- request body ---
{"handle":"qa-5992e0118d2b","displayName":"QA 5992e0118d2b","password":"****","region":"eu"}

--- response: 201 in 41 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-6b4bde8a-a9aa-4504-9b73-2914f8676ff8
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
Location: /v1/accounts/qa-5992e0118d2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e0290d5e-2683-4613-abb7-11becf0b9265","handle":"qa-5992e0118d2b","displayName":"QA 5992e0118d2b","region":"eu","role":"user","createdAt":"2026-10-29T08:38:59.745319076Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2b8fc6b1-ddb3-4e0f-96c0-ed704823f2fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b8fc6b1-ddb3-4e0f-96c0-ed704823f2fb
Content-Type: application/json

--- request body ---
{"handle":"qa-1d48bfb8502f","password":"****"}

--- response: 200 in 32 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b8fc6b1-ddb3-4e0f-96c0-ed704823f2fb
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4100c788-2a2b-47e7-8fd6-480fc6f50bde"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-53bb23d1-4b10-4bc3-b11d-005028f10c6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53bb23d1-4b10-4bc3-b11d-005028f10c6d
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-5992e0118d2b","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 71 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/json
X-Correlation-Id: qa-53bb23d1-4b10-4bc3-b11d-005028f10c6d
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
Location: /v1/conversations/cnv_8f8ca18a-43ee-40fc-8183-9396a419819e
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_8f8ca18a-43ee-40fc-8183-9396a419819e","subject":"Lunch?","status":"open","region":"eu","participants":["qa-1d48bfb8502f","qa-5992e0118d2b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:59.925528912Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-52950a41-a2e3-4e96-9067-e6fe4b763b28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52950a41-a2e3-4e96-9067-e6fe4b763b28
Content-Type: application/json

--- request body ---
{"handle":"qa-5992e0118d2b","password":"****"}

--- response: 200 in 42 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-52950a41-a2e3-4e96-9067-e6fe4b763b28
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e0290d5e-2683-4613-abb7-11becf0b9265"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_8f8ca18a-43ee-40fc-8183-9396a419819e/messages
correlation: qa-00a6854d-e224-49f2-b165-ff1f7170ece0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00a6854d-e224-49f2-b165-ff1f7170ece0
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 18 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-00a6854d-e224-49f2-b165-ff1f7170ece0
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

{"id":"msg_f6feaccb-a6bf-4611-a9c1-6d0fc7588c06","conversationId":"cnv_8f8ca18a-43ee-40fc-8183-9396a419819e","sender":"qa-5992e0118d2b","body":"Friday works","createdAt":"2026-10-29T08:39:00.091008328Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_8f8ca18a-43ee-40fc-8183-9396a419819e/messages
correlation: qa-c8e06089-4480-4364-911a-88490ec25ff6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8e06089-4480-4364-911a-88490ec25ff6
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8e06089-4480-4364-911a-88490ec25ff6
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

{"items":[{"id":"msg_7165535a-de00-4266-ba42-971a47ecc27a","conversationId":"cnv_8f8ca18a-43ee-40fc-8183-9396a419819e","sender":"qa-1d48bfb8502f","body":"Free on Friday?","createdAt":"2026-10-29T08:38:59.928258205Z"},{"id":"msg_f6feaccb-a6bf-4611-a9c1-6d0fc7588c06","conversationId":"cnv_8f8ca18a-43ee-40fc-8183-9396a419819e","sender":"qa-5992e0118d2b","body":"Friday works","createdAt":"2026-10-29T08:39:00.091008328Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d7b7ae38-90a6-4760-9682-7f63b8568060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d7b7ae38-90a6-4760-9682-7f63b8568060
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d7b7ae38-90a6-4760-9682-7f63b8568060
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
correlation: qa-18836371-e838-488b-aa9a-12a608b6aaa7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18836371-e838-488b-aa9a-12a608b6aaa7
Content-Type: application/json

--- request body ---
{"handle":"qa-5992e0118d2b","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18836371-e838-488b-aa9a-12a608b6aaa7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-18836371-e838-488b-aa9a-12a608b6aaa7"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2dbaf4b6-6fcc-4627-bdfa-84c8d9be18e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2dbaf4b6-6fcc-4627-bdfa-84c8d9be18e4
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2dbaf4b6-6fcc-4627-bdfa-84c8d9be18e4
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
correlation: qa-474176d2-6b70-4d71-b1ad-1e597af3ca8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-474176d2-6b70-4d71-b1ad-1e597af3ca8e
Content-Type: application/json

--- request body ---
{"handle":"qa-1d48bfb8502f","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:39:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-474176d2-6b70-4d71-b1ad-1e597af3ca8e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-474176d2-6b70-4d71-b1ad-1e597af3ca8e"}
```
