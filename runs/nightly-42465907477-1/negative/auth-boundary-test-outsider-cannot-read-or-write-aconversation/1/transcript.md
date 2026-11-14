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
| 1 | `POST /v1/accounts` | 201 | 19 | `qa-ecbc5746-0ac5-4ce0-91ae-a5c14e22a318` |
| 2 | `POST /v1/accounts` | 201 | 17 | `qa-e970f92d-45c8-4c30-b2ae-e072e2c9d4f2` |
| 3 | `POST /v1/accounts` | 201 | 12 | `qa-26fa15d1-9353-4472-af8a-d509c1625334` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-85f55d3d-d381-400c-afc7-f81d871e6a13` |
| 5 | `POST /v1/conversations` | 201 | 29 | `qa-459f6e53-519f-4afc-b0c0-f32b1df55f61` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-bb571286-2788-4d02-bdf2-09e0ebd17de8` |
| 7 | `GET /v1/conversations/{id}` | 403 | 8 | `qa-7b27de8e-f2da-44c5-be6c-1aa45e55a433` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 7 | `qa-bddaa10a-8b2a-4e4d-a4d3-412de7ed8e78` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 8 | `qa-23f08847-1cf6-441c-a104-00553d635c66` |
| 10 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-24718372-d29c-4cc9-a305-0c83952ee8c2` |
| 11 | `POST /v1/auth/token` | 401 | 6 | `qa-a5f10250-d1fb-49aa-917e-1496f092151e` |
| 12 | `POST /v1/auth/token` | 200 | 10 | `qa-dc3fe31e-a1d6-4499-b9c6-490d79e1f7b2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-b119bce1-5a54-4478-a8b2-4b2e102934cd` |
| 14 | `POST /v1/auth/token` | 401 | 3 | `qa-09663c53-c460-4e07-89eb-78ee466c162c` |
| 15 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-d91c6691-376a-4a30-b87f-cbfcaa0c7073` |
| 16 | `POST /v1/auth/token` | 401 | 3 | `qa-83893610-f1fa-4ea9-9aa9-111dc74eddf5` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-ecbc5746-0ac5-4ce0-91ae-a5c14e22a318

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ecbc5746-0ac5-4ce0-91ae-a5c14e22a318
Content-Type: application/json

--- request body ---
{"handle":"qa-285831f3b754","displayName":"QA 285831f3b754","password":"****","region":"eu"}

--- response: 201 in 19 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ecbc5746-0ac5-4ce0-91ae-a5c14e22a318
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
Location: /v1/accounts/qa-285831f3b754
X-Served-Region: eu
Content-Length: 181

{"id":"acc_facc0c41-e48f-4a84-a22d-911284aa0a32","handle":"qa-285831f3b754","displayName":"QA 285831f3b754","region":"eu","role":"user","createdAt":"2026-11-08T09:09:06.759780138Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-e970f92d-45c8-4c30-b2ae-e072e2c9d4f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e970f92d-45c8-4c30-b2ae-e072e2c9d4f2
Content-Type: application/json

--- request body ---
{"handle":"qa-4c58fa19b800","displayName":"QA 4c58fa19b800","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e970f92d-45c8-4c30-b2ae-e072e2c9d4f2
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
Location: /v1/accounts/qa-4c58fa19b800
X-Served-Region: eu
Content-Length: 181

{"id":"acc_323a67af-4d53-47ca-9709-4578f6e8b6f6","handle":"qa-4c58fa19b800","displayName":"QA 4c58fa19b800","region":"eu","role":"user","createdAt":"2026-11-08T09:09:06.788004535Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-26fa15d1-9353-4472-af8a-d509c1625334

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26fa15d1-9353-4472-af8a-d509c1625334
Content-Type: application/json

--- request body ---
{"handle":"qa-18a8a74b0633","displayName":"QA 18a8a74b0633","password":"****","region":"eu"}

--- response: 201 in 12 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-26fa15d1-9353-4472-af8a-d509c1625334
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 581
RateLimit-Reset: 9
Location: /v1/accounts/qa-18a8a74b0633
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9e1fd954-6691-4a65-8236-feeece2e1efb","handle":"qa-18a8a74b0633","displayName":"QA 18a8a74b0633","region":"eu","role":"user","createdAt":"2026-11-08T09:09:06.812900921Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-85f55d3d-d381-400c-afc7-f81d871e6a13

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85f55d3d-d381-400c-afc7-f81d871e6a13
Content-Type: application/json

--- request body ---
{"handle":"qa-285831f3b754","password":"****"}

--- response: 200 in 30 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-85f55d3d-d381-400c-afc7-f81d871e6a13
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 579
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_facc0c41-e48f-4a84-a22d-911284aa0a32"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-459f6e53-519f-4afc-b0c0-f32b1df55f61

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-459f6e53-519f-4afc-b0c0-f32b1df55f61
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4c58fa19b800","subject":"Private","message":"Just us"}

--- response: 201 in 29 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-459f6e53-519f-4afc-b0c0-f32b1df55f61
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
Location: /v1/conversations/cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34","subject":"Private","status":"open","region":"eu","participants":["qa-285831f3b754","qa-4c58fa19b800"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-08T09:09:06.879049969Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-bb571286-2788-4d02-bdf2-09e0ebd17de8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bb571286-2788-4d02-bdf2-09e0ebd17de8
Content-Type: application/json

--- request body ---
{"handle":"qa-18a8a74b0633","password":"****"}

--- response: 200 in 9 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bb571286-2788-4d02-bdf2-09e0ebd17de8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9e1fd954-6691-4a65-8236-feeece2e1efb"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34
correlation: qa-7b27de8e-f2da-44c5-be6c-1aa45e55a433

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b27de8e-f2da-44c5-be6c-1aa45e55a433
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b27de8e-f2da-44c5-be6c-1aa45e55a433
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34","correlationId":"qa-7b27de8e-f2da-44c5-be6c-1aa45e55a433"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34/messages
correlation: qa-bddaa10a-8b2a-4e4d-a4d3-412de7ed8e78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bddaa10a-8b2a-4e4d-a4d3-412de7ed8e78
Content-Type: application/json

--- response: 403 in 7 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-bddaa10a-8b2a-4e4d-a4d3-412de7ed8e78
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34/messages","correlationId":"qa-bddaa10a-8b2a-4e4d-a4d3-412de7ed8e78"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34/messages
correlation: qa-23f08847-1cf6-441c-a104-00553d635c66

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23f08847-1cf6-441c-a104-00553d635c66
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 8 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23f08847-1cf6-441c-a104-00553d635c66
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_9a8ae87a-75d6-4f26-89be-1bd14dd83b34/messages","correlationId":"qa-23f08847-1cf6-441c-a104-00553d635c66"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-24718372-d29c-4cc9-a305-0c83952ee8c2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24718372-d29c-4cc9-a305-0c83952ee8c2
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-24718372-d29c-4cc9-a305-0c83952ee8c2
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
correlation: qa-a5f10250-d1fb-49aa-917e-1496f092151e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5f10250-d1fb-49aa-917e-1496f092151e
Content-Type: application/json

--- request body ---
{"handle":"qa-18a8a74b0633","password":"****"}

--- response: 401 in 6 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5f10250-d1fb-49aa-917e-1496f092151e
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5f10250-d1fb-49aa-917e-1496f092151e"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-dc3fe31e-a1d6-4499-b9c6-490d79e1f7b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dc3fe31e-a1d6-4499-b9c6-490d79e1f7b2
Content-Type: application/json

--- request body ---
{"handle":"qa-4c58fa19b800","password":"****"}

--- response: 200 in 10 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-dc3fe31e-a1d6-4499-b9c6-490d79e1f7b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 569
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_323a67af-4d53-47ca-9709-4578f6e8b6f6"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b119bce1-5a54-4478-a8b2-4b2e102934cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b119bce1-5a54-4478-a8b2-4b2e102934cd
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b119bce1-5a54-4478-a8b2-4b2e102934cd
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
correlation: qa-09663c53-c460-4e07-89eb-78ee466c162c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-09663c53-c460-4e07-89eb-78ee466c162c
Content-Type: application/json

--- request body ---
{"handle":"qa-4c58fa19b800","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-09663c53-c460-4e07-89eb-78ee466c162c
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-09663c53-c460-4e07-89eb-78ee466c162c"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-d91c6691-376a-4a30-b87f-cbfcaa0c7073

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d91c6691-376a-4a30-b87f-cbfcaa0c7073
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-d91c6691-376a-4a30-b87f-cbfcaa0c7073
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
correlation: qa-83893610-f1fa-4ea9-9aa9-111dc74eddf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83893610-f1fa-4ea9-9aa9-111dc74eddf5
Content-Type: application/json

--- request body ---
{"handle":"qa-285831f3b754","password":"****"}

--- response: 401 in 3 ms ---
Date: Sun, 08 Nov 2026 09:09:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-83893610-f1fa-4ea9-9aa9-111dc74eddf5
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-83893610-f1fa-4ea9-9aa9-111dc74eddf5"}
```
