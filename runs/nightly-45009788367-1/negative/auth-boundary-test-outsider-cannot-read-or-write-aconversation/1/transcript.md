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
| 1 | `POST /v1/accounts` | 201 | 483 | `qa-fca32973-58c3-48c2-9902-a8dcf413bb79` |
| 2 | `POST /v1/accounts` | 201 | 94 | `qa-4dd9604a-4b66-4eb7-a8cd-b9234aa48450` |
| 3 | `POST /v1/accounts` | 201 | 32 | `qa-d5103c51-8f0a-4eaf-978a-0f9b1660e1df` |
| 4 | `POST /v1/auth/token` | 200 | 36 | `qa-99fd01f0-523d-4cc4-a4db-3e863deebf2f` |
| 5 | `POST /v1/conversations` | 201 | 37 | `qa-3ae474ee-8623-4b14-8f37-0c30d39d7ead` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-b9760797-ad1a-49de-bbc9-32d6011f7da7` |
| 7 | `GET /v1/conversations/{id}` | 403 | 24 | `qa-f38fd718-8ff5-4cc3-87ed-2b717114ca73` |
| 8 | `GET /v1/conversations/{id}/messages` | 403 | 34 | `qa-eddf077c-9784-4bc2-8619-33f64e754b70` |
| 9 | `POST /v1/conversations/{id}/messages` | 403 | 18 | `qa-695bf302-df67-4ecc-bed8-dec564ca5d52` |
| 10 | `DELETE /v1/accounts/me` | 204 | 13 | `qa-e7749d22-9c73-44f3-9a71-40a5ea90fecf` |
| 11 | `POST /v1/auth/token` | 401 | 11 | `qa-10bc3e45-8305-46cc-86db-45660c8ab36f` |
| 12 | `POST /v1/auth/token` | 200 | 21 | `qa-41a28e32-5120-42b3-9326-624be3bf2ab1` |
| 13 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-cc7304d5-b86f-478e-8d81-58375bbc6cb7` |
| 14 | `POST /v1/auth/token` | 401 | 18 | `qa-b35056db-ac8e-4421-ac59-6db000908a49` |
| 15 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-9fe3429f-5db2-4517-a5a8-77dc16cbead1` |
| 16 | `POST /v1/auth/token` | 401 | 13 | `qa-29a2dc43-d6fc-4386-adae-0d9a7bbd7262` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fca32973-58c3-48c2-9902-a8dcf413bb79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fca32973-58c3-48c2-9902-a8dcf413bb79
Content-Type: application/json

--- request body ---
{"handle":"qa-32e41f44f145","displayName":"QA 32e41f44f145","password":"****","region":"eu"}

--- response: 201 in 483 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-fca32973-58c3-48c2-9902-a8dcf413bb79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 11
Location: /v1/accounts/qa-32e41f44f145
X-Served-Region: eu
Content-Length: 181

{"id":"acc_4819dcea-92e6-4dda-945c-77f8fdabda05","handle":"qa-32e41f44f145","displayName":"QA 32e41f44f145","region":"eu","role":"user","createdAt":"2026-11-22T09:54:49.546470716Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4dd9604a-4b66-4eb7-a8cd-b9234aa48450

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4dd9604a-4b66-4eb7-a8cd-b9234aa48450
Content-Type: application/json

--- request body ---
{"handle":"qa-01f0e5c95977","displayName":"QA 01f0e5c95977","password":"****","region":"eu"}

--- response: 201 in 94 ms ---
Date: Sun, 22 Nov 2026 09:54:49 GMT
Content-Type: application/json
X-Correlation-Id: qa-4dd9604a-4b66-4eb7-a8cd-b9234aa48450
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
Location: /v1/accounts/qa-01f0e5c95977
X-Served-Region: eu
Content-Length: 181

{"id":"acc_68d92ae9-2222-45ef-9e74-dc134024d02e","handle":"qa-01f0e5c95977","displayName":"QA 01f0e5c95977","region":"eu","role":"user","createdAt":"2026-11-22T09:54:50.073308370Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d5103c51-8f0a-4eaf-978a-0f9b1660e1df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5103c51-8f0a-4eaf-978a-0f9b1660e1df
Content-Type: application/json

--- request body ---
{"handle":"qa-c767d5c33cc8","displayName":"QA c767d5c33cc8","password":"****","region":"eu"}

--- response: 201 in 32 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5103c51-8f0a-4eaf-978a-0f9b1660e1df
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
Location: /v1/accounts/qa-c767d5c33cc8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d48f9876-bcbd-4fd1-8c7f-e73e0efe281f","handle":"qa-c767d5c33cc8","displayName":"QA c767d5c33cc8","region":"eu","role":"user","createdAt":"2026-11-22T09:54:50.140055504Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-99fd01f0-523d-4cc4-a4db-3e863deebf2f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-99fd01f0-523d-4cc4-a4db-3e863deebf2f
Content-Type: application/json

--- request body ---
{"handle":"qa-32e41f44f145","password":"****"}

--- response: 200 in 36 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-99fd01f0-523d-4cc4-a4db-3e863deebf2f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_4819dcea-92e6-4dda-945c-77f8fdabda05"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-3ae474ee-8623-4b14-8f37-0c30d39d7ead

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ae474ee-8623-4b14-8f37-0c30d39d7ead
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-01f0e5c95977","subject":"Private","message":"Just us"}

--- response: 201 in 37 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ae474ee-8623-4b14-8f37-0c30d39d7ead
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
Location: /v1/conversations/cnv_11356266-1ee1-4d06-9d96-103606d1fa6e
X-Data-Region: eu
Content-Length: 230

{"id":"cnv_11356266-1ee1-4d06-9d96-103606d1fa6e","subject":"Private","status":"open","region":"eu","participants":["qa-32e41f44f145","qa-01f0e5c95977"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-22T09:54:50.340152532Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b9760797-ad1a-49de-bbc9-32d6011f7da7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9760797-ad1a-49de-bbc9-32d6011f7da7
Content-Type: application/json

--- request body ---
{"handle":"qa-c767d5c33cc8","password":"****"}

--- response: 200 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/json
X-Correlation-Id: qa-b9760797-ad1a-49de-bbc9-32d6011f7da7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d48f9876-bcbd-4fd1-8c7f-e73e0efe281f"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_11356266-1ee1-4d06-9d96-103606d1fa6e
correlation: qa-f38fd718-8ff5-4cc3-87ed-2b717114ca73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f38fd718-8ff5-4cc3-87ed-2b717114ca73
Content-Type: application/json

--- response: 403 in 24 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f38fd718-8ff5-4cc3-87ed-2b717114ca73
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_11356266-1ee1-4d06-9d96-103606d1fa6e","correlationId":"qa-f38fd718-8ff5-4cc3-87ed-2b717114ca73"}
```

## 8. GET /v1/conversations/{id}/messages

```text
#8 GET http://localhost:7070/v1/conversations/cnv_11356266-1ee1-4d06-9d96-103606d1fa6e/messages
correlation: qa-eddf077c-9784-4bc2-8619-33f64e754b70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eddf077c-9784-4bc2-8619-33f64e754b70
Content-Type: application/json

--- response: 403 in 34 ms ---
Date: Sun, 22 Nov 2026 09:54:50 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eddf077c-9784-4bc2-8619-33f64e754b70
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_11356266-1ee1-4d06-9d96-103606d1fa6e/messages","correlationId":"qa-eddf077c-9784-4bc2-8619-33f64e754b70"}
```

## 9. POST /v1/conversations/{id}/messages

```text
#9 POST http://localhost:7070/v1/conversations/cnv_11356266-1ee1-4d06-9d96-103606d1fa6e/messages
correlation: qa-695bf302-df67-4ecc-bed8-dec564ca5d52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-695bf302-df67-4ecc-bed8-dec564ca5d52
Content-Type: application/json

--- request body ---
{"body":"Let me in"}

--- response: 403 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-695bf302-df67-4ecc-bed8-dec564ca5d52
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_11356266-1ee1-4d06-9d96-103606d1fa6e/messages","correlationId":"qa-695bf302-df67-4ecc-bed8-dec564ca5d52"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e7749d22-9c73-44f3-9a71-40a5ea90fecf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7749d22-9c73-44f3-9a71-40a5ea90fecf
Content-Type: application/json

--- response: 204 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e7749d22-9c73-44f3-9a71-40a5ea90fecf
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
correlation: qa-10bc3e45-8305-46cc-86db-45660c8ab36f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10bc3e45-8305-46cc-86db-45660c8ab36f
Content-Type: application/json

--- request body ---
{"handle":"qa-c767d5c33cc8","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10bc3e45-8305-46cc-86db-45660c8ab36f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 589
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10bc3e45-8305-46cc-86db-45660c8ab36f"}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-41a28e32-5120-42b3-9326-624be3bf2ab1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41a28e32-5120-42b3-9326-624be3bf2ab1
Content-Type: application/json

--- request body ---
{"handle":"qa-01f0e5c95977","password":"****"}

--- response: 200 in 21 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-41a28e32-5120-42b3-9326-624be3bf2ab1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 588
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_68d92ae9-2222-45ef-9e74-dc134024d02e"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-cc7304d5-b86f-478e-8d81-58375bbc6cb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc7304d5-b86f-478e-8d81-58375bbc6cb7
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-cc7304d5-b86f-478e-8d81-58375bbc6cb7
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
correlation: qa-b35056db-ac8e-4421-ac59-6db000908a49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b35056db-ac8e-4421-ac59-6db000908a49
Content-Type: application/json

--- request body ---
{"handle":"qa-01f0e5c95977","password":"****"}

--- response: 401 in 18 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b35056db-ac8e-4421-ac59-6db000908a49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 584
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b35056db-ac8e-4421-ac59-6db000908a49"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9fe3429f-5db2-4517-a5a8-77dc16cbead1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fe3429f-5db2-4517-a5a8-77dc16cbead1
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9fe3429f-5db2-4517-a5a8-77dc16cbead1
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
correlation: qa-29a2dc43-d6fc-4386-adae-0d9a7bbd7262

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29a2dc43-d6fc-4386-adae-0d9a7bbd7262
Content-Type: application/json

--- request body ---
{"handle":"qa-32e41f44f145","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 22 Nov 2026 09:54:51 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-29a2dc43-d6fc-4386-adae-0d9a7bbd7262
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-29a2dc43-d6fc-4386-adae-0d9a7bbd7262"}
```
