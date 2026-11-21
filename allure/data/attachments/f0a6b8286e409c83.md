# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[2]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-51386d24-5307-4324-931c-3d1ad3c7e6fb` |
| 2 | `POST /v1/accounts` | 201 | 22 | `qa-80c95af5-2ae7-42e4-aa65-43a5806f1ad6` |
| 3 | `POST /v1/accounts` | 201 | 33 | `qa-5e641b39-eaa3-4993-8374-af61e467dcab` |
| 4 | `POST /v1/auth/token` | 200 | 42 | `qa-5aa51af1-1b9e-4f77-8963-82cd194c566c` |
| 5 | `POST /v1/conversations` | 201 | 8 | `qa-0f00d994-a658-4721-99ee-1ff95215ffbf` |
| 6 | `POST /v1/auth/token` | 200 | 30 | `qa-bbfc2ee2-19ce-4a26-9d70-15c6e6567365` |
| 7 | `POST /v1/conversations/{id}/messages` | 403 | 29 | `qa-92f04031-f679-4d9d-9aea-d3bfe762f5a4` |
| 8 | `DELETE /v1/accounts/me` | 204 | 45 | `qa-2c1419f3-04a6-4d5f-9b2b-64e48016ea78` |
| 9 | `POST /v1/auth/token` | 401 | 23 | `qa-5bab1953-9129-41f0-a2fe-bd57960f0f45` |
| 10 | `POST /v1/auth/token` | 200 | 53 | `qa-8d9a6867-cd5a-4dd2-ac7b-6694c73b91f2` |
| 11 | `DELETE /v1/accounts/me` | 204 | 93 | `qa-64fe9f6a-8a38-4bbe-a031-d34540dcd880` |
| 12 | `POST /v1/auth/token` | 401 | 41 | `qa-5325cd97-8b9c-4362-9d0f-1016f9ca91e9` |
| 13 | `DELETE /v1/accounts/me` | 204 | 30 | `qa-8919944b-bd0c-4d81-ad74-16c3334e2279` |
| 14 | `POST /v1/auth/token` | 401 | 46 | `qa-f75acd03-eb26-4445-a64a-969bc56136fc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-51386d24-5307-4324-931c-3d1ad3c7e6fb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51386d24-5307-4324-931c-3d1ad3c7e6fb
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2bfde82e86","displayName":"QA 9a2bfde82e86","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-51386d24-5307-4324-931c-3d1ad3c7e6fb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 543
RateLimit-Reset: 9
Location: /v1/accounts/qa-9a2bfde82e86
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5249d66f-18d0-41c0-81d3-a5da07867f09","handle":"qa-9a2bfde82e86","displayName":"QA 9a2bfde82e86","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.384660885Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-80c95af5-2ae7-42e4-aa65-43a5806f1ad6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80c95af5-2ae7-42e4-aa65-43a5806f1ad6
Content-Type: application/json

--- request body ---
{"handle":"qa-f1171d8e08bc","displayName":"QA f1171d8e08bc","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-80c95af5-2ae7-42e4-aa65-43a5806f1ad6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-f1171d8e08bc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1a30027f-b9cd-443a-b738-324ca2f38882","handle":"qa-f1171d8e08bc","displayName":"QA f1171d8e08bc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.427343513Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-5e641b39-eaa3-4993-8374-af61e467dcab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e641b39-eaa3-4993-8374-af61e467dcab
Content-Type: application/json

--- request body ---
{"handle":"qa-0c44e33a0163","displayName":"QA 0c44e33a0163","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e641b39-eaa3-4993-8374-af61e467dcab
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 537
RateLimit-Reset: 9
Location: /v1/accounts/qa-0c44e33a0163
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7b684982-e12b-4155-a238-03a63b159db1","handle":"qa-0c44e33a0163","displayName":"QA 0c44e33a0163","region":"eu","role":"user","createdAt":"2026-11-21T09:57:09.468281056Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-5aa51af1-1b9e-4f77-8963-82cd194c566c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aa51af1-1b9e-4f77-8963-82cd194c566c
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2bfde82e86","password":"****"}

--- response: 200 in 42 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aa51af1-1b9e-4f77-8963-82cd194c566c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 536
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5249d66f-18d0-41c0-81d3-a5da07867f09"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-0f00d994-a658-4721-99ee-1ff95215ffbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f00d994-a658-4721-99ee-1ff95215ffbf
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f1171d8e08bc","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f00d994-a658-4721-99ee-1ff95215ffbf
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
Location: /v1/conversations/cnv_8c02e3d9-7019-4cb8-acb8-8163da34bc7b
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_8c02e3d9-7019-4cb8-acb8-8163da34bc7b","subject":"Error contract","status":"open","region":"eu","participants":["qa-9a2bfde82e86","qa-f1171d8e08bc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:09.552405019Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bbfc2ee2-19ce-4a26-9d70-15c6e6567365

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bbfc2ee2-19ce-4a26-9d70-15c6e6567365
Content-Type: application/json

--- request body ---
{"handle":"qa-0c44e33a0163","password":"****"}

--- response: 200 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-bbfc2ee2-19ce-4a26-9d70-15c6e6567365
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 529
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7b684982-e12b-4155-a238-03a63b159db1"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_8c02e3d9-7019-4cb8-acb8-8163da34bc7b/messages
correlation: qa-92f04031-f679-4d9d-9aea-d3bfe762f5a4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92f04031-f679-4d9d-9aea-d3bfe762f5a4
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 403 in 29 ms ---
Date: Sat, 21 Nov 2026 09:57:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-92f04031-f679-4d9d-9aea-d3bfe762f5a4
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_8c02e3d9-7019-4cb8-acb8-8163da34bc7b/messages","correlationId":"qa-92f04031-f679-4d9d-9aea-d3bfe762f5a4"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2c1419f3-04a6-4d5f-9b2b-64e48016ea78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c1419f3-04a6-4d5f-9b2b-64e48016ea78
Content-Type: application/json

--- response: 204 in 45 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2c1419f3-04a6-4d5f-9b2b-64e48016ea78
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
correlation: qa-5bab1953-9129-41f0-a2fe-bd57960f0f45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5bab1953-9129-41f0-a2fe-bd57960f0f45
Content-Type: application/json

--- request body ---
{"handle":"qa-0c44e33a0163","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5bab1953-9129-41f0-a2fe-bd57960f0f45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5bab1953-9129-41f0-a2fe-bd57960f0f45"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-8d9a6867-cd5a-4dd2-ac7b-6694c73b91f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8d9a6867-cd5a-4dd2-ac7b-6694c73b91f2
Content-Type: application/json

--- request body ---
{"handle":"qa-f1171d8e08bc","password":"****"}

--- response: 200 in 53 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8d9a6867-cd5a-4dd2-ac7b-6694c73b91f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 502
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1a30027f-b9cd-443a-b738-324ca2f38882"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-64fe9f6a-8a38-4bbe-a031-d34540dcd880

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64fe9f6a-8a38-4bbe-a031-d34540dcd880
Content-Type: application/json

--- response: 204 in 93 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-64fe9f6a-8a38-4bbe-a031-d34540dcd880
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

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-5325cd97-8b9c-4362-9d0f-1016f9ca91e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5325cd97-8b9c-4362-9d0f-1016f9ca91e9
Content-Type: application/json

--- request body ---
{"handle":"qa-f1171d8e08bc","password":"****"}

--- response: 401 in 41 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5325cd97-8b9c-4362-9d0f-1016f9ca91e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 479
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5325cd97-8b9c-4362-9d0f-1016f9ca91e9"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8919944b-bd0c-4d81-ad74-16c3334e2279

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8919944b-bd0c-4d81-ad74-16c3334e2279
Content-Type: application/json

--- response: 204 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8919944b-bd0c-4d81-ad74-16c3334e2279
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-f75acd03-eb26-4445-a64a-969bc56136fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f75acd03-eb26-4445-a64a-969bc56136fc
Content-Type: application/json

--- request body ---
{"handle":"qa-9a2bfde82e86","password":"****"}

--- response: 401 in 46 ms ---
Date: Sat, 21 Nov 2026 09:57:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f75acd03-eb26-4445-a64a-969bc56136fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 462
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f75acd03-eb26-4445-a64a-969bc56136fc"}
```
