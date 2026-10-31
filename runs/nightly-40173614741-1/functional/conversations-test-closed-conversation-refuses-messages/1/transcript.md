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
| 1 | `POST /v1/accounts` | 201 | 461 | `qa-8f5c7c30-fc55-423a-9468-dc31b203c9df` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-a40c4056-a9d1-42fb-9bd7-e26952ea5805` |
| 3 | `POST /v1/auth/token` | 200 | 17 | `qa-dc28cc8b-7da3-4ca2-92c1-55afbd650f46` |
| 4 | `POST /v1/conversations` | 201 | 57 | `qa-f6fc9ca1-bf3f-4800-bdbd-f15b800e1af0` |
| 5 | `POST /v1/conversations/{id}/close` | 200 | 22 | `qa-90e832ba-263b-4a20-9950-d61443087c53` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-db3ccfae-9bef-4f5a-9530-1234aa937d46` |
| 7 | `POST /v1/conversations/{id}/messages` | 409 | 26 | `qa-198e0c5e-0d1f-47ea-853f-eb298c4da8e9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-2c6cfad9-c6be-4d28-a20b-97829e37cdb5` |
| 9 | `POST /v1/auth/token` | 401 | 6 | `qa-7bb23e86-0d72-4136-9ff0-3bab78e18733` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-69a60f9a-bb2c-4691-b9c0-e9e156790938` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-a7758e50-a55d-436d-a05f-acea8ac94924` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8f5c7c30-fc55-423a-9468-dc31b203c9df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f5c7c30-fc55-423a-9468-dc31b203c9df
Content-Type: application/json

--- request body ---
{"handle":"qa-35a1680baf9b","displayName":"QA 35a1680baf9b","password":"****","region":"eu"}

--- response: 201 in 461 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f5c7c30-fc55-423a-9468-dc31b203c9df
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
Location: /v1/accounts/qa-35a1680baf9b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b6143ca8-c4d3-4d32-aada-145076cdf517","handle":"qa-35a1680baf9b","displayName":"QA 35a1680baf9b","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.175855392Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a40c4056-a9d1-42fb-9bd7-e26952ea5805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a40c4056-a9d1-42fb-9bd7-e26952ea5805
Content-Type: application/json

--- request body ---
{"handle":"qa-487c54e00d9a","displayName":"QA 487c54e00d9a","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-a40c4056-a9d1-42fb-9bd7-e26952ea5805
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
Location: /v1/accounts/qa-487c54e00d9a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b5a66ccf-eef2-45e7-ae99-eb530e67d193","handle":"qa-487c54e00d9a","displayName":"QA 487c54e00d9a","region":"eu","role":"user","createdAt":"2026-10-25T07:40:26.616944212Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-dc28cc8b-7da3-4ca2-92c1-55afbd650f46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc28cc8b-7da3-4ca2-92c1-55afbd650f46
Content-Type: application/json

--- request body ---
{"handle":"qa-35a1680baf9b","password":"****"}

--- response: 200 in 17 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc28cc8b-7da3-4ca2-92c1-55afbd650f46
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b6143ca8-c4d3-4d32-aada-145076cdf517"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-f6fc9ca1-bf3f-4800-bdbd-f15b800e1af0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6fc9ca1-bf3f-4800-bdbd-f15b800e1af0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-487c54e00d9a","subject":"Quick question","message":"Hi"}

--- response: 201 in 57 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6fc9ca1-bf3f-4800-bdbd-f15b800e1af0
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
Location: /v1/conversations/cnv_d04191dd-227e-4d2a-863a-e96a2df07401
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_d04191dd-227e-4d2a-863a-e96a2df07401","subject":"Quick question","status":"open","region":"eu","participants":["qa-35a1680baf9b","qa-487c54e00d9a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.749153457Z"}
```

## 5. POST /v1/conversations/{id}/close

```text
#5 POST http://localhost:7070/v1/conversations/cnv_d04191dd-227e-4d2a-863a-e96a2df07401/close
correlation: qa-90e832ba-263b-4a20-9950-d61443087c53

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90e832ba-263b-4a20-9950-d61443087c53
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-90e832ba-263b-4a20-9950-d61443087c53
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

{"id":"cnv_d04191dd-227e-4d2a-863a-e96a2df07401","subject":"Quick question","status":"closed","region":"eu","participants":["qa-35a1680baf9b","qa-487c54e00d9a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-25T07:40:26.749153457Z","closedAt":"2026-10-25T07:40:26.888590565Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-db3ccfae-9bef-4f5a-9530-1234aa937d46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db3ccfae-9bef-4f5a-9530-1234aa937d46
Content-Type: application/json

--- request body ---
{"handle":"qa-487c54e00d9a","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 25 Oct 2026 07:40:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-db3ccfae-9bef-4f5a-9530-1234aa937d46
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b5a66ccf-eef2-45e7-ae99-eb530e67d193"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_d04191dd-227e-4d2a-863a-e96a2df07401/messages
correlation: qa-198e0c5e-0d1f-47ea-853f-eb298c4da8e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-198e0c5e-0d1f-47ea-853f-eb298c4da8e9
Content-Type: application/json

--- request body ---
{"body":"One more thing"}

--- response: 409 in 26 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-198e0c5e-0d1f-47ea-853f-eb298c4da8e9
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

{"type":"https://reference-service.example/problems/conversation-closed","title":"Conversation closed","status":409,"detail":"The conversation has been closed and accepts no more messages.","instance":"/v1/conversations/cnv_d04191dd-227e-4d2a-863a-e96a2df07401/messages","correlationId":"qa-198e0c5e-0d1f-47ea-853f-eb298c4da8e9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c6cfad9-c6be-4d28-a20b-97829e37cdb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c6cfad9-c6be-4d28-a20b-97829e37cdb5
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c6cfad9-c6be-4d28-a20b-97829e37cdb5
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
correlation: qa-7bb23e86-0d72-4136-9ff0-3bab78e18733

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bb23e86-0d72-4136-9ff0-3bab78e18733
Content-Type: application/json

--- request body ---
{"handle":"qa-487c54e00d9a","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bb23e86-0d72-4136-9ff0-3bab78e18733
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-7bb23e86-0d72-4136-9ff0-3bab78e18733"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-69a60f9a-bb2c-4691-b9c0-e9e156790938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69a60f9a-bb2c-4691-b9c0-e9e156790938
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: text/plain
X-Correlation-Id: qa-69a60f9a-bb2c-4691-b9c0-e9e156790938
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
correlation: qa-a7758e50-a55d-436d-a05f-acea8ac94924

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7758e50-a55d-436d-a05f-acea8ac94924
Content-Type: application/json

--- request body ---
{"handle":"qa-35a1680baf9b","password":"****"}

--- response: 401 in 5 ms ---
Date: Sun, 25 Oct 2026 07:40:27 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a7758e50-a55d-436d-a05f-acea8ac94924
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a7758e50-a55d-436d-a05f-acea8ac94924"}
```
