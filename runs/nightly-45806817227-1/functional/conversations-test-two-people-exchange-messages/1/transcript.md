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
| 1 | `POST /v1/accounts` | 201 | 362 | `qa-561bff11-6985-4d36-9ca0-ba29a497a1c7` |
| 2 | `POST /v1/accounts` | 201 | 26 | `qa-5a58de1f-b504-466a-92e9-939137a64a29` |
| 3 | `POST /v1/auth/token` | 200 | 29 | `qa-8f4d9629-f64f-498d-a6c8-2b804374c54e` |
| 4 | `POST /v1/conversations` | 201 | 67 | `qa-cc971130-d780-4a05-9eba-11a7ec793fe4` |
| 5 | `POST /v1/auth/token` | 200 | 19 | `qa-26691829-bd86-4022-b306-1440cb250190` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 31 | `qa-0ea9e075-5e42-4bc5-9f90-b0230efa0c62` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 26 | `qa-e166963b-bb0d-4c69-adf1-8b7167a80f8b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 7 | `qa-8bb6302a-d674-4761-9327-6fa06811959e` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-87ce570b-4022-424f-b705-4d43aafff654` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-8e6e81b2-b8cc-4e23-be4e-348847226060` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-28bdf37e-f034-497d-9788-55103b26161f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-561bff11-6985-4d36-9ca0-ba29a497a1c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-561bff11-6985-4d36-9ca0-ba29a497a1c7
Content-Type: application/json

--- request body ---
{"handle":"qa-5723000342e1","displayName":"QA 5723000342e1","password":"****","region":"eu"}

--- response: 201 in 362 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-561bff11-6985-4d36-9ca0-ba29a497a1c7
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
Location: /v1/accounts/qa-5723000342e1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e23aeb8-5289-4168-acc6-5c544a7a6631","handle":"qa-5723000342e1","displayName":"QA 5723000342e1","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.123070202Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-5a58de1f-b504-466a-92e9-939137a64a29

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a58de1f-b504-466a-92e9-939137a64a29
Content-Type: application/json

--- request body ---
{"handle":"qa-3610aaece97d","displayName":"QA 3610aaece97d","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a58de1f-b504-466a-92e9-939137a64a29
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
Location: /v1/accounts/qa-3610aaece97d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2060db47-8ca2-4138-876f-a45a91b09e16","handle":"qa-3610aaece97d","displayName":"QA 3610aaece97d","region":"eu","role":"user","createdAt":"2026-11-26T11:02:34.411119188Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8f4d9629-f64f-498d-a6c8-2b804374c54e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f4d9629-f64f-498d-a6c8-2b804374c54e
Content-Type: application/json

--- request body ---
{"handle":"qa-5723000342e1","password":"****"}

--- response: 200 in 29 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f4d9629-f64f-498d-a6c8-2b804374c54e
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e23aeb8-5289-4168-acc6-5c544a7a6631"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-cc971130-d780-4a05-9eba-11a7ec793fe4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc971130-d780-4a05-9eba-11a7ec793fe4
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3610aaece97d","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 67 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc971130-d780-4a05-9eba-11a7ec793fe4
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
Location: /v1/conversations/cnv_56d150fc-b0ec-4631-9c87-6400ea655116
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_56d150fc-b0ec-4631-9c87-6400ea655116","subject":"Lunch?","status":"open","region":"eu","participants":["qa-5723000342e1","qa-3610aaece97d"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-26T11:02:34.550490897Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-26691829-bd86-4022-b306-1440cb250190

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26691829-bd86-4022-b306-1440cb250190
Content-Type: application/json

--- request body ---
{"handle":"qa-3610aaece97d","password":"****"}

--- response: 200 in 19 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-26691829-bd86-4022-b306-1440cb250190
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2060db47-8ca2-4138-876f-a45a91b09e16"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_56d150fc-b0ec-4631-9c87-6400ea655116/messages
correlation: qa-0ea9e075-5e42-4bc5-9f90-b0230efa0c62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ea9e075-5e42-4bc5-9f90-b0230efa0c62
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 31 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ea9e075-5e42-4bc5-9f90-b0230efa0c62
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

{"id":"msg_2121b35f-2bc3-43dc-ac7a-297ac1332653","conversationId":"cnv_56d150fc-b0ec-4631-9c87-6400ea655116","sender":"qa-3610aaece97d","body":"Friday works","createdAt":"2026-11-26T11:02:34.676897885Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_56d150fc-b0ec-4631-9c87-6400ea655116/messages
correlation: qa-e166963b-bb0d-4c69-adf1-8b7167a80f8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e166963b-bb0d-4c69-adf1-8b7167a80f8b
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/json
X-Correlation-Id: qa-e166963b-bb0d-4c69-adf1-8b7167a80f8b
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

{"items":[{"id":"msg_5519431c-d083-46c6-9480-4776ac230541","conversationId":"cnv_56d150fc-b0ec-4631-9c87-6400ea655116","sender":"qa-5723000342e1","body":"Free on Friday?","createdAt":"2026-11-26T11:02:34.550635896Z"},{"id":"msg_2121b35f-2bc3-43dc-ac7a-297ac1332653","conversationId":"cnv_56d150fc-b0ec-4631-9c87-6400ea655116","sender":"qa-3610aaece97d","body":"Friday works","createdAt":"2026-11-26T11:02:34.676897885Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8bb6302a-d674-4761-9327-6fa06811959e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bb6302a-d674-4761-9327-6fa06811959e
Content-Type: application/json

--- response: 204 in 7 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8bb6302a-d674-4761-9327-6fa06811959e
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
correlation: qa-87ce570b-4022-424f-b705-4d43aafff654

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-87ce570b-4022-424f-b705-4d43aafff654
Content-Type: application/json

--- request body ---
{"handle":"qa-3610aaece97d","password":"****"}

--- response: 401 in 9 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-87ce570b-4022-424f-b705-4d43aafff654
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-87ce570b-4022-424f-b705-4d43aafff654"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8e6e81b2-b8cc-4e23-be4e-348847226060

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8e6e81b2-b8cc-4e23-be4e-348847226060
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8e6e81b2-b8cc-4e23-be4e-348847226060
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
correlation: qa-28bdf37e-f034-497d-9788-55103b26161f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28bdf37e-f034-497d-9788-55103b26161f
Content-Type: application/json

--- request body ---
{"handle":"qa-5723000342e1","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 26 Nov 2026 11:02:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-28bdf37e-f034-497d-9788-55103b26161f
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-28bdf37e-f034-497d-9788-55103b26161f"}
```
