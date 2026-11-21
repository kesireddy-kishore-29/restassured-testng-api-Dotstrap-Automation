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
| 1 | `POST /v1/accounts` | 201 | 471 | `qa-3de7dba6-3ade-4a6c-96ee-aa2ae13460dd` |
| 2 | `POST /v1/accounts` | 201 | 52 | `qa-2f1c1b72-42bd-4eb4-bbab-cd3af93abdfd` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-36bdab38-1939-4df6-8adc-3b87a8d2f21c` |
| 4 | `POST /v1/conversations` | 201 | 68 | `qa-bf8c559c-9dd1-42b9-a2b5-96c03d1b1925` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 26 | `qa-605cfb9b-9e15-4e18-9671-97cca7053f5d` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-fc154188-4228-43e7-8d3f-ccc46fed19b2` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 33 | `qa-b36e9227-0f5a-409f-b9d4-ec4520851d1e` |
| 8 | `DELETE /v1/accounts/me` | 204 | 8 | `qa-34a095f6-06e5-4713-a500-01959759bf84` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-debdfca8-c51b-4ef9-8437-4b9a72dfb068` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-25c30663-c1c5-4245-bf74-807e14118f13` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-de805439-0fb3-463d-b9d9-8f9d6d578366` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-3de7dba6-3ade-4a6c-96ee-aa2ae13460dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3de7dba6-3ade-4a6c-96ee-aa2ae13460dd
Content-Type: application/json

--- request body ---
{"handle":"qa-b38d1b4baafe","displayName":"QA b38d1b4baafe","password":"****","region":"eu"}

--- response: 201 in 471 ms ---
Date: Wed, 18 Nov 2026 10:19:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-3de7dba6-3ade-4a6c-96ee-aa2ae13460dd
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
Location: /v1/accounts/qa-b38d1b4baafe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ccb1542-305a-4d9f-878d-42a027d42c38","handle":"qa-b38d1b4baafe","displayName":"QA b38d1b4baafe","region":"eu","role":"user","createdAt":"2026-11-18T10:19:51.890485379Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-2f1c1b72-42bd-4eb4-bbab-cd3af93abdfd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f1c1b72-42bd-4eb4-bbab-cd3af93abdfd
Content-Type: application/json

--- request body ---
{"handle":"qa-8e9381acf8c1","displayName":"QA 8e9381acf8c1","password":"****","region":"eu"}

--- response: 201 in 52 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f1c1b72-42bd-4eb4-bbab-cd3af93abdfd
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
Location: /v1/accounts/qa-8e9381acf8c1
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e90fd12f-d08a-4ed5-9c8e-1cd9ba177df2","handle":"qa-8e9381acf8c1","displayName":"QA 8e9381acf8c1","region":"eu","role":"user","createdAt":"2026-11-18T10:19:52.333750845Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-36bdab38-1939-4df6-8adc-3b87a8d2f21c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36bdab38-1939-4df6-8adc-3b87a8d2f21c
Content-Type: application/json

--- request body ---
{"handle":"qa-b38d1b4baafe","password":"****"}

--- response: 200 in 34 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-36bdab38-1939-4df6-8adc-3b87a8d2f21c
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ccb1542-305a-4d9f-878d-42a027d42c38"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-bf8c559c-9dd1-42b9-a2b5-96c03d1b1925

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf8c559c-9dd1-42b9-a2b5-96c03d1b1925
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-8e9381acf8c1","subject":"Quick question","message":"Hi"}

--- response: 201 in 68 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf8c559c-9dd1-42b9-a2b5-96c03d1b1925
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
Location: /v1/conversations/cnv_f6761708-b764-4522-9ac5-89fd11c4ef5a
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_f6761708-b764-4522-9ac5-89fd11c4ef5a","subject":"Quick question","status":"open","region":"eu","participants":["qa-b38d1b4baafe","qa-8e9381acf8c1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.499243927Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_f6761708-b764-4522-9ac5-89fd11c4ef5a/close
correlation: qa-605cfb9b-9e15-4e18-9671-97cca7053f5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-605cfb9b-9e15-4e18-9671-97cca7053f5d
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-605cfb9b-9e15-4e18-9671-97cca7053f5d
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

{"id":"cnv_f6761708-b764-4522-9ac5-89fd11c4ef5a","subject":"Quick question","status":"closed","region":"eu","participants":["qa-b38d1b4baafe","qa-8e9381acf8c1"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:19:52.499243927Z","closedAt":"2026-11-18T10:19:52.590959015Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-fc154188-4228-43e7-8d3f-ccc46fed19b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fc154188-4228-43e7-8d3f-ccc46fed19b2
Content-Type: application/json

--- request body ---
{"handle":"qa-8e9381acf8c1","password":"****"}

--- response: 200 in 22 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-fc154188-4228-43e7-8d3f-ccc46fed19b2
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e90fd12f-d08a-4ed5-9c8e-1cd9ba177df2"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_f6761708-b764-4522-9ac5-89fd11c4ef5a/messages
correlation: qa-b36e9227-0f5a-409f-b9d4-ec4520851d1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b36e9227-0f5a-409f-b9d4-ec4520851d1e
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 33 ms ---
Date: Wed, 18 Nov 2026 10:19:52 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b36e9227-0f5a-409f-b9d4-ec4520851d1e
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_f6761708-b764-4522-9ac5-89fd11c4ef5a/messages","correlationId":"qa-b36e9227-0f5a-409f-b9d4-ec4520851d1e"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-34a095f6-06e5-4713-a500-01959759bf84

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-34a095f6-06e5-4713-a500-01959759bf84
Content-Type: application/json

--- response: 204 in 8 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-34a095f6-06e5-4713-a500-01959759bf84
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
correlation: qa-debdfca8-c51b-4ef9-8437-4b9a72dfb068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-debdfca8-c51b-4ef9-8437-4b9a72dfb068
Content-Type: application/json

--- request body ---
{"handle":"qa-8e9381acf8c1","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-debdfca8-c51b-4ef9-8437-4b9a72dfb068
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-debdfca8-c51b-4ef9-8437-4b9a72dfb068"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-25c30663-c1c5-4245-bf74-807e14118f13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25c30663-c1c5-4245-bf74-807e14118f13
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: text/plain
X-Correlation-Id: qa-25c30663-c1c5-4245-bf74-807e14118f13
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
correlation: qa-de805439-0fb3-463d-b9d9-8f9d6d578366

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de805439-0fb3-463d-b9d9-8f9d6d578366
Content-Type: application/json

--- request body ---
{"handle":"qa-b38d1b4baafe","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 18 Nov 2026 10:19:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de805439-0fb3-463d-b9d9-8f9d6d578366
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-de805439-0fb3-463d-b9d9-8f9d6d578366"}
```
