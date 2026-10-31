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
| 1 | `POST /v1/accounts` | 201 | 417 | `qa-99b8c6e3-3ff4-4859-be7f-1fcbd6498b47` |
| 2 | `POST /v1/accounts` | 201 | 126 | `qa-d9aedf72-9baf-4741-ac8b-5c7c5bc280fb` |
| 3 | `POST /v1/auth/token` | 200 | 51 | `qa-3f0ae8e5-a0ab-4bac-9a6e-2731bb4816c7` |
| 4 | `POST /v1/conversations` | 201 | 69 | `qa-0dc24a5b-1611-4281-ae73-e1d818c966bc` |
| 5 | `POST /v1/auth/token` | 200 | 38 | `qa-cbe4a463-bc17-4d96-907c-52149f29e23a` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 23 | `qa-4bb84d10-ce5d-47c0-ba44-9c409bc5448c` |
| 7 | `GET /v1/conversations/{id}/messages` | 200 | 16 | `qa-3ac10498-85b5-4925-9c9d-ae9f034b9c5b` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-9bfc5b08-24b7-43ea-90f1-fa553288c5ee` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-8837202b-84d3-4a0c-a1f6-1bd5e309273a` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-aeb31454-7b3c-4959-9a1b-f7dead6cd1f1` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-0bbe04c5-bec9-4105-bb0e-7b5d0e7c0847` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-99b8c6e3-3ff4-4859-be7f-1fcbd6498b47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99b8c6e3-3ff4-4859-be7f-1fcbd6498b47
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5b739b5126","displayName":"QA dd5b739b5126","password":"****","region":"eu"}

--- response: 201 in 417 ms ---
Date: Mon, 26 Oct 2026 07:54:44 GMT
Content-Type: application/json
X-Correlation-Id: qa-99b8c6e3-3ff4-4859-be7f-1fcbd6498b47
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
Location: /v1/accounts/qa-dd5b739b5126
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b3c1473-3168-4244-921e-029e728a7fd4","handle":"qa-dd5b739b5126","displayName":"QA dd5b739b5126","region":"eu","role":"user","createdAt":"2026-10-26T07:54:44.996481614Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d9aedf72-9baf-4741-ac8b-5c7c5bc280fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9aedf72-9baf-4741-ac8b-5c7c5bc280fb
Content-Type: application/json

--- request body ---
{"handle":"qa-1a5e6bb628eb","displayName":"QA 1a5e6bb628eb","password":"****","region":"eu"}

--- response: 201 in 126 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9aedf72-9baf-4741-ac8b-5c7c5bc280fb
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
Location: /v1/accounts/qa-1a5e6bb628eb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_12debc66-0d83-440a-ad10-3b0d46008877","handle":"qa-1a5e6bb628eb","displayName":"QA 1a5e6bb628eb","region":"eu","role":"user","createdAt":"2026-10-26T07:54:45.513509592Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f0ae8e5-a0ab-4bac-9a6e-2731bb4816c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f0ae8e5-a0ab-4bac-9a6e-2731bb4816c7
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5b739b5126","password":"****"}

--- response: 200 in 51 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f0ae8e5-a0ab-4bac-9a6e-2731bb4816c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b3c1473-3168-4244-921e-029e728a7fd4"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-0dc24a5b-1611-4281-ae73-e1d818c966bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0dc24a5b-1611-4281-ae73-e1d818c966bc
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-1a5e6bb628eb","subject":"Lunch?","message":"Free on Friday?"}

--- response: 201 in 69 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-0dc24a5b-1611-4281-ae73-e1d818c966bc
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
Location: /v1/conversations/cnv_eac28c25-6246-43b7-8969-230cfbd70f29
X-Data-Region: eu
Content-Length: 229

{"id":"cnv_eac28c25-6246-43b7-8969-230cfbd70f29","subject":"Lunch?","status":"open","region":"eu","participants":["qa-dd5b739b5126","qa-1a5e6bb628eb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-26T07:54:45.673017131Z"}
```

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-cbe4a463-bc17-4d96-907c-52149f29e23a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cbe4a463-bc17-4d96-907c-52149f29e23a
Content-Type: application/json

--- request body ---
{"handle":"qa-1a5e6bb628eb","password":"****"}

--- response: 200 in 38 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-cbe4a463-bc17-4d96-907c-52149f29e23a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_12debc66-0d83-440a-ad10-3b0d46008877"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_eac28c25-6246-43b7-8969-230cfbd70f29/messages
correlation: qa-4bb84d10-ce5d-47c0-ba44-9c409bc5448c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bb84d10-ce5d-47c0-ba44-9c409bc5448c
Content-Type: application/json

--- request body ---
{"body":"Friday works"}

--- response: 201 in 23 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bb84d10-ce5d-47c0-ba44-9c409bc5448c
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

{"id":"msg_75d88fd5-9e9a-4836-a4c2-44d32fbc97f3","conversationId":"cnv_eac28c25-6246-43b7-8969-230cfbd70f29","sender":"qa-1a5e6bb628eb","body":"Friday works","createdAt":"2026-10-26T07:54:45.831862550Z"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_eac28c25-6246-43b7-8969-230cfbd70f29/messages
correlation: qa-3ac10498-85b5-4925-9c9d-ae9f034b9c5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ac10498-85b5-4925-9c9d-ae9f034b9c5b
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ac10498-85b5-4925-9c9d-ae9f034b9c5b
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

{"items":[{"id":"msg_1375fa77-254c-4d6b-90ba-5f77e2d452dc","conversationId":"cnv_eac28c25-6246-43b7-8969-230cfbd70f29","sender":"qa-dd5b739b5126","body":"Free on Friday?","createdAt":"2026-10-26T07:54:45.673325417Z"},{"id":"msg_75d88fd5-9e9a-4836-a4c2-44d32fbc97f3","conversationId":"cnv_eac28c25-6246-43b7-8969-230cfbd70f29","sender":"qa-1a5e6bb628eb","body":"Friday works","createdAt":"2026-10-26T07:54:45.831862550Z"}],"total":2}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9bfc5b08-24b7-43ea-90f1-fa553288c5ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9bfc5b08-24b7-43ea-90f1-fa553288c5ee
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9bfc5b08-24b7-43ea-90f1-fa553288c5ee
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
correlation: qa-8837202b-84d3-4a0c-a1f6-1bd5e309273a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8837202b-84d3-4a0c-a1f6-1bd5e309273a
Content-Type: application/json

--- request body ---
{"handle":"qa-1a5e6bb628eb","password":"****"}

--- response: 401 in 8 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8837202b-84d3-4a0c-a1f6-1bd5e309273a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 585
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8837202b-84d3-4a0c-a1f6-1bd5e309273a"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aeb31454-7b3c-4959-9a1b-f7dead6cd1f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aeb31454-7b3c-4959-9a1b-f7dead6cd1f1
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aeb31454-7b3c-4959-9a1b-f7dead6cd1f1
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
correlation: qa-0bbe04c5-bec9-4105-bb0e-7b5d0e7c0847

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bbe04c5-bec9-4105-bb0e-7b5d0e7c0847
Content-Type: application/json

--- request body ---
{"handle":"qa-dd5b739b5126","password":"****"}

--- response: 401 in 7 ms ---
Date: Mon, 26 Oct 2026 07:54:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0bbe04c5-bec9-4105-bb0e-7b5d0e7c0847
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0bbe04c5-bec9-4105-bb0e-7b5d0e7c0847"}
```
