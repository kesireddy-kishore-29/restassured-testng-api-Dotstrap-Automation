# Transcript: Someone outside a conversation gets 403, not its content

| | |
|---|---|
| Test | `com.qaautomation.tests.negative.AuthBoundaryTest#outsiderCannotReadOrWriteAConversation` |
| Features | FEAT-AUTHZ-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 11 | `qa-6c7eaf46-15ad-488f-8ae7-dafee6cd6395` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-6c2072f9-d008-4e58-9b34-69a58862be30` |
| 3 | `POST /v1/accounts` | 201 | 10 | `qa-d2c1620d-6c90-4928-8d1a-1d89ab91164a` |
| 4 | `POST /v1/auth/token` | 200 | 10 | `qa-994ade1d-5f98-47b5-99dc-31048c18eb55` |
| 5 | `POST /v1/conversations` | 201 | 9 | `qa-a3dfa42a-06cf-403a-90e7-bf28a165d769` |
| 6 | `POST /v1/auth/token` | 200 | 16 | `qa-edb24b56-3855-4dce-8a77-72989f61bf82` |
| 7 | `GET /v1/conversations/{id}` | 403 | 9 | `qa-179ced7d-f5e1-427c-92d2-c8530bbaa62b` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 10 | `qa-f053ccb0-5a3e-4732-847b-eff9fe1bab2f` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 5 | `qa-c66e3100-5487-4504-8d39-1390a9923f98` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5e171652-eb76-4bd2-9781-b8800b091265` |
| 11 | `POST /v1/auth/token` | 401 | 5 | `qa-95328cbf-a064-4164-a1fc-4eb158a21068` |
| 12 | `POST /v1/auth/token` | 200 | 8 | `qa-4e0fffe1-b1cc-4352-91f4-7b3329adaad9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-a84b2955-a321-4682-81b1-85546b809afe` |
| 14 | `POST /v1/auth/token` | 401 | 6 | `qa-a0d7c3af-3003-4664-b28c-d69736d66dd9` |
| 15 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-374bbf40-a1b1-4674-8430-8520283227bf` |
| 16 | `POST /v1/auth/token` | 401 | 5 | `qa-6d58a472-d78c-4859-a02e-d3458efe1416` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-6c7eaf46-15ad-488f-8ae7-dafee6cd6395

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c7eaf46-15ad-488f-8ae7-dafee6cd6395
Content-Type: application/json

--- request body ---
{"handle":"qa-ddd612be3875","displayName":"QA ddd612be3875","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c7eaf46-15ad-488f-8ae7-dafee6cd6395
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 577
RateLimit-Reset: 9
Location: /v1/accounts/qa-ddd612be3875
X-Served-Region: eu
Content-Length: 181

{"id":"acc_2b530a63-868d-447b-bf9e-1bdc080f3949","handle":"qa-ddd612be3875","displayName":"QA ddd612be3875","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.648467511Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6c2072f9-d008-4e58-9b34-69a58862be30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c2072f9-d008-4e58-9b34-69a58862be30
Content-Type: application/json

--- request body ---
{"handle":"qa-7a79f9c477fb","displayName":"QA 7a79f9c477fb","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-6c2072f9-d008-4e58-9b34-69a58862be30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 576
RateLimit-Reset: 9
Location: /v1/accounts/qa-7a79f9c477fb
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a90c0120-8169-4c22-a4be-92cf42951b3f","handle":"qa-7a79f9c477fb","displayName":"QA 7a79f9c477fb","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.675692642Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d2c1620d-6c90-4928-8d1a-1d89ab91164a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d2c1620d-6c90-4928-8d1a-1d89ab91164a
Content-Type: application/json

--- request body ---
{"handle":"qa-ecee8dcaba96","displayName":"QA ecee8dcaba96","password":"****","region":"eu"}

--- response: 201 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-d2c1620d-6c90-4928-8d1a-1d89ab91164a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 9
Location: /v1/accounts/qa-ecee8dcaba96
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7bf051f5-6a60-4006-af47-5c41bfa8158e","handle":"qa-ecee8dcaba96","displayName":"QA ecee8dcaba96","region":"eu","role":"user","createdAt":"2026-10-24T07:25:02.708662108Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-994ade1d-5f98-47b5-99dc-31048c18eb55

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-994ade1d-5f98-47b5-99dc-31048c18eb55
Content-Type: application/json

--- request body ---
{"handle":"qa-ddd612be3875","password":"****"}

--- response: 200 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-994ade1d-5f98-47b5-99dc-31048c18eb55
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 573
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_2b530a63-868d-447b-bf9e-1bdc080f3949"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-a3dfa42a-06cf-403a-90e7-bf28a165d769

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a3dfa42a-06cf-403a-90e7-bf28a165d769
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-7a79f9c477fb","subject":"Private","message":"Just us"}

--- response: 201 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-a3dfa42a-06cf-403a-90e7-bf28a165d769
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
Location: /v1/conversations/cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9","subject":"Private","status":"open","region":"eu","participants":["qa-ddd612be3875","qa-7a79f9c477fb"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.741403721Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-edb24b56-3855-4dce-8a77-72989f61bf82

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edb24b56-3855-4dce-8a77-72989f61bf82
Content-Type: application/json

--- request body ---
{"handle":"qa-ecee8dcaba96","password":"****"}

--- response: 200 in 16 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-edb24b56-3855-4dce-8a77-72989f61bf82
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7bf051f5-6a60-4006-af47-5c41bfa8158e"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9
correlation: qa-179ced7d-f5e1-427c-92d2-c8530bbaa62b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-179ced7d-f5e1-427c-92d2-c8530bbaa62b
Content-Type: application/json

--- response: 403 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-179ced7d-f5e1-427c-92d2-c8530bbaa62b
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
Content-Length: 285

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9","correlationId":"qa-179ced7d-f5e1-427c-92d2-c8530bbaa62b"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9/messages
correlation: qa-f053ccb0-5a3e-4732-847b-eff9fe1bab2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f053ccb0-5a3e-4732-847b-eff9fe1bab2f
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f053ccb0-5a3e-4732-847b-eff9fe1bab2f
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9/messages","correlationId":"qa-f053ccb0-5a3e-4732-847b-eff9fe1bab2f"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9/messages
correlation: qa-c66e3100-5487-4504-8d39-1390a9923f98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c66e3100-5487-4504-8d39-1390a9923f98
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c66e3100-5487-4504-8d39-1390a9923f98
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_6ffa5e9d-2104-4862-8491-2c73b9f0b8b9/messages","correlationId":"qa-c66e3100-5487-4504-8d39-1390a9923f98"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e171652-eb76-4bd2-9781-b8800b091265

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e171652-eb76-4bd2-9781-b8800b091265
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e171652-eb76-4bd2-9781-b8800b091265
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
```

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-95328cbf-a064-4164-a1fc-4eb158a21068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95328cbf-a064-4164-a1fc-4eb158a21068
Content-Type: application/json

--- request body ---
{"handle":"qa-ecee8dcaba96","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95328cbf-a064-4164-a1fc-4eb158a21068
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95328cbf-a064-4164-a1fc-4eb158a21068"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-4e0fffe1-b1cc-4352-91f4-7b3329adaad9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e0fffe1-b1cc-4352-91f4-7b3329adaad9
Content-Type: application/json

--- request body ---
{"handle":"qa-7a79f9c477fb","password":"****"}

--- response: 200 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e0fffe1-b1cc-4352-91f4-7b3329adaad9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a90c0120-8169-4c22-a4be-92cf42951b3f"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a84b2955-a321-4682-81b1-85546b809afe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a84b2955-a321-4682-81b1-85546b809afe
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a84b2955-a321-4682-81b1-85546b809afe
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
```

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-a0d7c3af-3003-4664-b28c-d69736d66dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0d7c3af-3003-4664-b28c-d69736d66dd9
Content-Type: application/json

--- request body ---
{"handle":"qa-7a79f9c477fb","password":"****"}

--- response: 401 in 6 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a0d7c3af-3003-4664-b28c-d69736d66dd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 565
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a0d7c3af-3003-4664-b28c-d69736d66dd9"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-374bbf40-a1b1-4674-8430-8520283227bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-374bbf40-a1b1-4674-8430-8520283227bf
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-374bbf40-a1b1-4674-8430-8520283227bf
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

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-6d58a472-d78c-4859-a02e-d3458efe1416

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d58a472-d78c-4859-a02e-d3458efe1416
Content-Type: application/json

--- request body ---
{"handle":"qa-ddd612be3875","password":"****"}

--- response: 401 in 5 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d58a472-d78c-4859-a02e-d3458efe1416
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6d58a472-d78c-4859-a02e-d3458efe1416"}
```
