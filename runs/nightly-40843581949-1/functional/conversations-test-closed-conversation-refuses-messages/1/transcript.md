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
| 1 | `POST /v1/accounts` | 201 | 440 | `qa-b0afafec-18fb-48b2-9ce5-980b44558ba5` |
| 2 | `POST /v1/accounts` | 201 | 53 | `qa-3782d925-5ee5-4af4-b0e4-5ea4622b5570` |
| 3 | `POST /v1/auth/token` | 200 | 20 | `qa-8dc2c426-4889-4c23-b36c-e140028a1919` |
| 4 | `POST /v1/conversations` | 201 | 78 | `qa-9f7ce337-1372-4163-bd72-5c374cb7db77` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 21 | `qa-fdd77dda-a4a7-4b71-aa0c-631965cc7a52` |
| 6 | `POST /v1/auth/token` | 200 | 35 | `qa-5a403931-0711-4dc5-978b-6ca4e9f74dcc` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 21 | `qa-df5cfd14-182f-49ed-9391-0537550e7dc8` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-8335ab18-6be6-4e77-beb7-1eb9f070f55d` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-244d786a-3ab4-414a-a7b6-73253b49e58e` |
| 10 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-aa864ee7-ff95-4097-83ac-b6fca170f77e` |
| 11 | `POST /v1/auth/token` | 401 | 10 | `qa-62eb2889-2e86-47b7-a2ab-97a3518ed89b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b0afafec-18fb-48b2-9ce5-980b44558ba5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b0afafec-18fb-48b2-9ce5-980b44558ba5
Content-Type: application/json

--- request body ---
{"handle":"qa-77c8111b9704","displayName":"QA 77c8111b9704","password":"****","region":"eu"}

--- response: 201 in 440 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b0afafec-18fb-48b2-9ce5-980b44558ba5
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
Location: /v1/accounts/qa-77c8111b9704
X-Served-Region: eu
Content-Length: 181

{"id":"acc_83d4f679-fcae-46af-b888-7602b1469ee6","handle":"qa-77c8111b9704","displayName":"QA 77c8111b9704","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.346011245Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-3782d925-5ee5-4af4-b0e4-5ea4622b5570

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3782d925-5ee5-4af4-b0e4-5ea4622b5570
Content-Type: application/json

--- request body ---
{"handle":"qa-2a4fc06ea59c","displayName":"QA 2a4fc06ea59c","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3782d925-5ee5-4af4-b0e4-5ea4622b5570
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
Location: /v1/accounts/qa-2a4fc06ea59c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c52c74c9-5590-4985-b98a-9be514674544","handle":"qa-2a4fc06ea59c","displayName":"QA 2a4fc06ea59c","region":"eu","role":"user","createdAt":"2026-10-29T08:38:57.773683237Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8dc2c426-4889-4c23-b36c-e140028a1919

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dc2c426-4889-4c23-b36c-e140028a1919
Content-Type: application/json

--- request body ---
{"handle":"qa-77c8111b9704","password":"****"}

--- response: 200 in 20 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8dc2c426-4889-4c23-b36c-e140028a1919
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_83d4f679-fcae-46af-b888-7602b1469ee6"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-9f7ce337-1372-4163-bd72-5c374cb7db77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f7ce337-1372-4163-bd72-5c374cb7db77
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-2a4fc06ea59c","subject":"Quick question","message":"Hi"}

--- response: 201 in 78 ms ---
Date: Thu, 29 Oct 2026 08:38:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f7ce337-1372-4163-bd72-5c374cb7db77
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
Location: /v1/conversations/cnv_5f600871-abb9-45c9-b607-91ce698bd509
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5f600871-abb9-45c9-b607-91ce698bd509","subject":"Quick question","status":"open","region":"eu","participants":["qa-77c8111b9704","qa-2a4fc06ea59c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:57.897455336Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_5f600871-abb9-45c9-b607-91ce698bd509/close
correlation: qa-fdd77dda-a4a7-4b71-aa0c-631965cc7a52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fdd77dda-a4a7-4b71-aa0c-631965cc7a52
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-fdd77dda-a4a7-4b71-aa0c-631965cc7a52
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

{"id":"cnv_5f600871-abb9-45c9-b607-91ce698bd509","subject":"Quick question","status":"closed","region":"eu","participants":["qa-77c8111b9704","qa-2a4fc06ea59c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-29T08:38:57.897455336Z","closedAt":"2026-10-29T08:38:58.009053713Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5a403931-0711-4dc5-978b-6ca4e9f74dcc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a403931-0711-4dc5-978b-6ca4e9f74dcc
Content-Type: application/json

--- request body ---
{"handle":"qa-2a4fc06ea59c","password":"****"}

--- response: 200 in 35 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a403931-0711-4dc5-978b-6ca4e9f74dcc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c52c74c9-5590-4985-b98a-9be514674544"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_5f600871-abb9-45c9-b607-91ce698bd509/messages
correlation: qa-df5cfd14-182f-49ed-9391-0537550e7dc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df5cfd14-182f-49ed-9391-0537550e7dc8
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 21 ms ---
Date: Thu, 29 Oct 2026 08:38:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-df5cfd14-182f-49ed-9391-0537550e7dc8
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_5f600871-abb9-45c9-b607-91ce698bd509/messages","correlationId":"qa-df5cfd14-182f-49ed-9391-0537550e7dc8"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8335ab18-6be6-4e77-beb7-1eb9f070f55d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8335ab18-6be6-4e77-beb7-1eb9f070f55d
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8335ab18-6be6-4e77-beb7-1eb9f070f55d
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
correlation: qa-244d786a-3ab4-414a-a7b6-73253b49e58e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-244d786a-3ab4-414a-a7b6-73253b49e58e
Content-Type: application/json

--- request body ---
{"handle":"qa-2a4fc06ea59c","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-244d786a-3ab4-414a-a7b6-73253b49e58e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-244d786a-3ab4-414a-a7b6-73253b49e58e"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aa864ee7-ff95-4097-83ac-b6fca170f77e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa864ee7-ff95-4097-83ac-b6fca170f77e
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aa864ee7-ff95-4097-83ac-b6fca170f77e
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
correlation: qa-62eb2889-2e86-47b7-a2ab-97a3518ed89b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-62eb2889-2e86-47b7-a2ab-97a3518ed89b
Content-Type: application/json

--- request body ---
{"handle":"qa-77c8111b9704","password":"****"}

--- response: 401 in 10 ms ---
Date: Thu, 29 Oct 2026 08:38:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-62eb2889-2e86-47b7-a2ab-97a3518ed89b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-62eb2889-2e86-47b7-a2ab-97a3518ed89b"}
```
