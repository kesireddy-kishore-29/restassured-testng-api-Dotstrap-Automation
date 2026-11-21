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
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-61ac0b01-7f7b-4385-ad4a-89a13b707e42` |
| 2 | `POST /v1/accounts` | 201 | 15 | `qa-50082c48-6b65-4f5c-822f-550f65589aab` |
| 3 | `POST /v1/accounts` | 201 | 25 | `qa-a76f97b4-d2b9-46e3-b0f7-ad6c6c944905` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-85e57a8c-d7e7-4484-91e2-8556c795fe6a` |
| 5 | `POST /v1/conversations` | 201 | 27 | `qa-b8622768-b732-42f6-beef-05523d067e18` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-43ef8358-995b-482b-827a-498bc2b42172` |
| 7 | `GET /v1/conversations/{id}` | 403 | 14 | `qa-30a16c27-5590-496e-af98-c32ecd5e67eb` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 20 | `qa-0eb1e74e-b6b0-4253-bfa4-5ed8922659ec` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 6 | `qa-ce19d9f6-6e11-490f-93c9-7230e246a742` |
| 10 | `DELETE /v1/accounts/me` | 204 | 6 | `qa-5227f4c0-c916-443b-8f7e-7d2cbae2570e` |
| 11 | `POST /v1/auth/token` | 401 | 7 | `qa-608ce8fa-4d2c-40f1-bdb3-f47e25c568a9` |
| 12 | `POST /v1/auth/token` | 200 | 7 | `qa-6d5622a2-151d-4854-96d5-543390b25884` |
| 13 | `DELETE /v1/accounts/me` | 204 | 10 | `qa-23a5b5a9-5693-4ed8-9a63-b07331bc8fcb` |
| 14 | `POST /v1/auth/token` | 401 | 4 | `qa-a5b91b0d-61ef-4055-8944-ba64bcbf6252` |
| 15 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-5e4210a5-9823-43e9-b49f-3ee878427f63` |
| 16 | `POST /v1/auth/token` | 401 | 4 | `qa-8dbd9eaa-6470-41e2-b384-1d6a0544e404` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-61ac0b01-7f7b-4385-ad4a-89a13b707e42

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61ac0b01-7f7b-4385-ad4a-89a13b707e42
Content-Type: application/json

--- request body ---
{"handle":"qa-a79341c4ab46","displayName":"QA a79341c4ab46","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-61ac0b01-7f7b-4385-ad4a-89a13b707e42
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
Location: /v1/accounts/qa-a79341c4ab46
X-Served-Region: eu
Content-Length: 181

{"id":"acc_14d01863-7732-4da6-9c03-b7967570aa29","handle":"qa-a79341c4ab46","displayName":"QA a79341c4ab46","region":"eu","role":"user","createdAt":"2026-11-18T10:20:00.060787972Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-50082c48-6b65-4f5c-822f-550f65589aab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50082c48-6b65-4f5c-822f-550f65589aab
Content-Type: application/json

--- request body ---
{"handle":"qa-3292e552a92f","displayName":"QA 3292e552a92f","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-50082c48-6b65-4f5c-822f-550f65589aab
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
Location: /v1/accounts/qa-3292e552a92f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_a7649631-40c9-4a44-9370-b05e3924a150","handle":"qa-3292e552a92f","displayName":"QA 3292e552a92f","region":"eu","role":"user","createdAt":"2026-11-18T10:20:00.087458862Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a76f97b4-d2b9-46e3-b0f7-ad6c6c944905

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a76f97b4-d2b9-46e3-b0f7-ad6c6c944905
Content-Type: application/json

--- request body ---
{"handle":"qa-d0e0ed5a5c2b","displayName":"QA d0e0ed5a5c2b","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-a76f97b4-d2b9-46e3-b0f7-ad6c6c944905
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 582
RateLimit-Reset: 9
Location: /v1/accounts/qa-d0e0ed5a5c2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80c9e5e6-83c8-4408-a649-5749519dd460","handle":"qa-d0e0ed5a5c2b","displayName":"QA d0e0ed5a5c2b","region":"eu","role":"user","createdAt":"2026-11-18T10:20:00.122598713Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-85e57a8c-d7e7-4484-91e2-8556c795fe6a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85e57a8c-d7e7-4484-91e2-8556c795fe6a
Content-Type: application/json

--- request body ---
{"handle":"qa-a79341c4ab46","password":"****"}

--- response: 200 in 17 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-85e57a8c-d7e7-4484-91e2-8556c795fe6a
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_14d01863-7732-4da6-9c03-b7967570aa29"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-b8622768-b732-42f6-beef-05523d067e18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b8622768-b732-42f6-beef-05523d067e18
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3292e552a92f","subject":"Private","message":"Just us"}

--- response: 201 in 27 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-b8622768-b732-42f6-beef-05523d067e18
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
Location: /v1/conversations/cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a","subject":"Private","status":"open","region":"eu","participants":["qa-a79341c4ab46","qa-3292e552a92f"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-18T10:20:00.190492668Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-43ef8358-995b-482b-827a-498bc2b42172

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43ef8358-995b-482b-827a-498bc2b42172
Content-Type: application/json

--- request body ---
{"handle":"qa-d0e0ed5a5c2b","password":"****"}

--- response: 200 in 20 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-43ef8358-995b-482b-827a-498bc2b42172
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80c9e5e6-83c8-4408-a649-5749519dd460"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a
correlation: qa-30a16c27-5590-496e-af98-c32ecd5e67eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-30a16c27-5590-496e-af98-c32ecd5e67eb
Content-Type: application/json

--- response: 403 in 14 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-30a16c27-5590-496e-af98-c32ecd5e67eb
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a","correlationId":"qa-30a16c27-5590-496e-af98-c32ecd5e67eb"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a/messages
correlation: qa-0eb1e74e-b6b0-4253-bfa4-5ed8922659ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0eb1e74e-b6b0-4253-bfa4-5ed8922659ec
Content-Type: application/json

--- response: 403 in 20 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0eb1e74e-b6b0-4253-bfa4-5ed8922659ec
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a/messages","correlationId":"qa-0eb1e74e-b6b0-4253-bfa4-5ed8922659ec"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a/messages
correlation: qa-ce19d9f6-6e11-490f-93c9-7230e246a742

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce19d9f6-6e11-490f-93c9-7230e246a742
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 6 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce19d9f6-6e11-490f-93c9-7230e246a742
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_7ddd6b47-81e5-44cc-a18b-a8716a82c84a/messages","correlationId":"qa-ce19d9f6-6e11-490f-93c9-7230e246a742"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5227f4c0-c916-443b-8f7e-7d2cbae2570e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5227f4c0-c916-443b-8f7e-7d2cbae2570e
Content-Type: application/json

--- response: 204 in 6 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5227f4c0-c916-443b-8f7e-7d2cbae2570e
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
correlation: qa-608ce8fa-4d2c-40f1-bdb3-f47e25c568a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-608ce8fa-4d2c-40f1-bdb3-f47e25c568a9
Content-Type: application/json

--- request body ---
{"handle":"qa-d0e0ed5a5c2b","password":"****"}

--- response: 401 in 7 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-608ce8fa-4d2c-40f1-bdb3-f47e25c568a9
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-608ce8fa-4d2c-40f1-bdb3-f47e25c568a9"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-6d5622a2-151d-4854-96d5-543390b25884

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d5622a2-151d-4854-96d5-543390b25884
Content-Type: application/json

--- request body ---
{"handle":"qa-3292e552a92f","password":"****"}

--- response: 200 in 7 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/json
X-Correlation-Id: qa-6d5622a2-151d-4854-96d5-543390b25884
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_a7649631-40c9-4a44-9370-b05e3924a150"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23a5b5a9-5693-4ed8-9a63-b07331bc8fcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23a5b5a9-5693-4ed8-9a63-b07331bc8fcb
Content-Type: application/json

--- response: 204 in 10 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23a5b5a9-5693-4ed8-9a63-b07331bc8fcb
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
correlation: qa-a5b91b0d-61ef-4055-8944-ba64bcbf6252

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5b91b0d-61ef-4055-8944-ba64bcbf6252
Content-Type: application/json

--- request body ---
{"handle":"qa-3292e552a92f","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a5b91b0d-61ef-4055-8944-ba64bcbf6252
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 568
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a5b91b0d-61ef-4055-8944-ba64bcbf6252"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5e4210a5-9823-43e9-b49f-3ee878427f63

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e4210a5-9823-43e9-b49f-3ee878427f63
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5e4210a5-9823-43e9-b49f-3ee878427f63
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
correlation: qa-8dbd9eaa-6470-41e2-b384-1d6a0544e404

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8dbd9eaa-6470-41e2-b384-1d6a0544e404
Content-Type: application/json

--- request body ---
{"handle":"qa-a79341c4ab46","password":"****"}

--- response: 401 in 4 ms ---
Date: Wed, 18 Nov 2026 10:20:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8dbd9eaa-6470-41e2-b384-1d6a0544e404
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8dbd9eaa-6470-41e2-b384-1d6a0544e404"}
```
