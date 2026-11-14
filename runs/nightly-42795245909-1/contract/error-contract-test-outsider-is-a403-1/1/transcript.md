# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 22 | `qa-c483b362-7638-481e-9fc3-d8db6969f0f2` |
| 2 | `POST /v1/accounts` | 201 | 33 | `qa-54fd92f9-cfa1-4034-aff4-d9839dd0f2af` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-2b587cd2-fc40-47ab-b73e-321ff7e41637` |
| 4 | `POST /v1/auth/token` | 200 | 23 | `qa-3e2485b6-32e1-43f1-9a99-efff996a7810` |
| 5 | `POST /v1/conversations` | 201 | 6 | `qa-f48667f4-f504-4c40-b0f0-4547e07b3577` |
| 6 | `POST /v1/auth/token` | 200 | 13 | `qa-f2b9f3c2-c6c9-49a7-b1e5-b3d3b8c257d8` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 21 | `qa-9152f7dc-ef3c-4c50-a81e-abb10bd7ca5d` |
| 8 | `DELETE /v1/accounts/me` | 204 | 21 | `qa-3ed31af6-4137-4e49-a19d-19060d667239` |
| 9 | `POST /v1/auth/token` | 401 | 34 | `qa-176b701e-d31c-4642-8927-ace33f969cfc` |
| 10 | `POST /v1/auth/token` | 200 | 23 | `qa-c7099b45-9418-4820-b8ae-d736e5458750` |
| 11 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-b51a9aed-f412-4388-9783-f1c866cc5eff` |
| 12 | `POST /v1/auth/token` | 401 | 7 | `qa-19f38049-3e04-45ba-9522-d2b93beb45ce` |
| 13 | `DELETE /v1/accounts/me` | 204 | 16 | `qa-23e631d1-394e-43ef-ab0f-1665ef3d9cd3` |
| 14 | `POST /v1/auth/token` | 401 | 52 | `qa-6e4879a2-3a40-4fd7-b17b-6fbc8e80e7ee` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c483b362-7638-481e-9fc3-d8db6969f0f2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c483b362-7638-481e-9fc3-d8db6969f0f2
Content-Type: application/json

--- request body ---
{"handle":"qa-e29c1c426bb3","displayName":"QA e29c1c426bb3","password":"****","region":"eu"}

--- response: 201 in 22 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-c483b362-7638-481e-9fc3-d8db6969f0f2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 547
RateLimit-Reset: 9
Location: /v1/accounts/qa-e29c1c426bb3
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1d0e4a10-d8d8-46cb-8fa7-c21c85e9e5bd","handle":"qa-e29c1c426bb3","displayName":"QA e29c1c426bb3","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.260053116Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-54fd92f9-cfa1-4034-aff4-d9839dd0f2af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54fd92f9-cfa1-4034-aff4-d9839dd0f2af
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b182c5b9aa","displayName":"QA b1b182c5b9aa","password":"****","region":"eu"}

--- response: 201 in 33 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-54fd92f9-cfa1-4034-aff4-d9839dd0f2af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 541
RateLimit-Reset: 9
Location: /v1/accounts/qa-b1b182c5b9aa
X-Served-Region: eu
Content-Length: 181

{"id":"acc_fc1abdfc-c877-4710-895c-54393d9c5e63","handle":"qa-b1b182c5b9aa","displayName":"QA b1b182c5b9aa","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.314132860Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-2b587cd2-fc40-47ab-b73e-321ff7e41637

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b587cd2-fc40-47ab-b73e-321ff7e41637
Content-Type: application/json

--- request body ---
{"handle":"qa-0216ff6a9b06","displayName":"QA 0216ff6a9b06","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-2b587cd2-fc40-47ab-b73e-321ff7e41637
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Location: /v1/accounts/qa-0216ff6a9b06
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f86805c0-7bcd-4f7f-9ab2-ab3c4676e483","handle":"qa-0216ff6a9b06","displayName":"QA 0216ff6a9b06","region":"eu","role":"user","createdAt":"2026-11-10T09:59:35.361798453Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3e2485b6-32e1-43f1-9a99-efff996a7810

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e2485b6-32e1-43f1-9a99-efff996a7810
Content-Type: application/json

--- request body ---
{"handle":"qa-e29c1c426bb3","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e2485b6-32e1-43f1-9a99-efff996a7810
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 530
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1d0e4a10-d8d8-46cb-8fa7-c21c85e9e5bd"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f48667f4-f504-4c40-b0f0-4547e07b3577

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f48667f4-f504-4c40-b0f0-4547e07b3577
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-b1b182c5b9aa","subject":"Error contract","message":"Hi"}

--- response: 201 in 6 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f48667f4-f504-4c40-b0f0-4547e07b3577
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
Location: /v1/conversations/cnv_100fe680-3e7e-4f9b-b1d9-7b23bd5bddd9
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_100fe680-3e7e-4f9b-b1d9-7b23bd5bddd9","subject":"Error contract","status":"open","region":"eu","participants":["qa-e29c1c426bb3","qa-b1b182c5b9aa"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-10T09:59:35.405919620Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-f2b9f3c2-c6c9-49a7-b1e5-b3d3b8c257d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f2b9f3c2-c6c9-49a7-b1e5-b3d3b8c257d8
Content-Type: application/json

--- request body ---
{"handle":"qa-0216ff6a9b06","password":"****"}

--- response: 200 in 13 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-f2b9f3c2-c6c9-49a7-b1e5-b3d3b8c257d8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f86805c0-7bcd-4f7f-9ab2-ab3c4676e483"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_100fe680-3e7e-4f9b-b1d9-7b23bd5bddd9/messages
correlation: qa-9152f7dc-ef3c-4c50-a81e-abb10bd7ca5d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9152f7dc-ef3c-4c50-a81e-abb10bd7ca5d
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9152f7dc-ef3c-4c50-a81e-abb10bd7ca5d
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_100fe680-3e7e-4f9b-b1d9-7b23bd5bddd9/messages","correlationId":"qa-9152f7dc-ef3c-4c50-a81e-abb10bd7ca5d"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3ed31af6-4137-4e49-a19d-19060d667239

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ed31af6-4137-4e49-a19d-19060d667239
Content-Type: application/json

--- response: 204 in 21 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3ed31af6-4137-4e49-a19d-19060d667239
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
correlation: qa-176b701e-d31c-4642-8927-ace33f969cfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-176b701e-d31c-4642-8927-ace33f969cfc
Content-Type: application/json

--- request body ---
{"handle":"qa-0216ff6a9b06","password":"****"}

--- response: 401 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-176b701e-d31c-4642-8927-ace33f969cfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 514
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-176b701e-d31c-4642-8927-ace33f969cfc"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c7099b45-9418-4820-b8ae-d736e5458750

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c7099b45-9418-4820-b8ae-d736e5458750
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b182c5b9aa","password":"****"}

--- response: 200 in 23 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c7099b45-9418-4820-b8ae-d736e5458750
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 511
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_fc1abdfc-c877-4710-895c-54393d9c5e63"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-b51a9aed-f412-4388-9783-f1c866cc5eff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b51a9aed-f412-4388-9783-f1c866cc5eff
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-b51a9aed-f412-4388-9783-f1c866cc5eff
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
correlation: qa-19f38049-3e04-45ba-9522-d2b93beb45ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-19f38049-3e04-45ba-9522-d2b93beb45ce
Content-Type: application/json

--- request body ---
{"handle":"qa-b1b182c5b9aa","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-19f38049-3e04-45ba-9522-d2b93beb45ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 494
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-19f38049-3e04-45ba-9522-d2b93beb45ce"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-23e631d1-394e-43ef-ab0f-1665ef3d9cd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e631d1-394e-43ef-ab0f-1665ef3d9cd3
Content-Type: application/json

--- response: 204 in 16 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-23e631d1-394e-43ef-ab0f-1665ef3d9cd3
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-6e4879a2-3a40-4fd7-b17b-6fbc8e80e7ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e4879a2-3a40-4fd7-b17b-6fbc8e80e7ee
Content-Type: application/json

--- request body ---
{"handle":"qa-e29c1c426bb3","password":"****"}

--- response: 401 in 52 ms ---
Date: Tue, 10 Nov 2026 09:59:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e4879a2-3a40-4fd7-b17b-6fbc8e80e7ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 469
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e4879a2-3a40-4fd7-b17b-6fbc8e80e7ee"}
```
