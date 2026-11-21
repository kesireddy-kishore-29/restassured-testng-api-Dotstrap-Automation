# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[0]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 20 | `qa-8467478b-736f-4d17-b134-dcc060f303cd` |
| 2 | `POST /v1/accounts` | 201 | 20 | `qa-0c801fce-7710-4205-8cc4-772bca03aa56` |
| 3 | `POST /v1/accounts` | 201 | 23 | `qa-b068d0fa-3c5f-46dd-bc05-1522f9dbd42b` |
| 4 | `POST /v1/auth/token` | 200 | 40 | `qa-52d1f80d-1dc3-4344-8388-fb79502edab0` |
| 5 | `POST /v1/conversations` | 201 | 13 | `qa-1be06409-8d93-4323-82c2-ad05f7627702` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-5c928883-719d-4128-ae84-beff4703f9e8` |
| 7 | `GET /v1/conversations/{id}` | 403 | 21 | `qa-f17a199b-fcc8-4469-876a-231d9c41acf5` |
| 8 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-ab57ffc9-8eb6-4933-a0e9-f92ae564a6ce` |
| 9 | `POST /v1/auth/token` | 401 | 22 | `qa-10538018-f3ff-4dca-bd0c-57d4f44cbcce` |
| 10 | `POST /v1/auth/token` | 200 | 46 | `qa-c8d1b06d-9792-4212-bba4-030045b5f9ca` |
| 11 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-15a30801-2fff-46ab-9527-6ad8d7bf64ec` |
| 12 | `POST /v1/auth/token` | 401 | 25 | `qa-1d06b03f-ea8f-40df-9003-010767affc62` |
| 13 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-0bcbda9a-2e26-44f3-a604-5806330d692f` |
| 14 | `POST /v1/auth/token` | 401 | 23 | `qa-45c5161f-0392-4902-8d0f-f88d7ce9854a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8467478b-736f-4d17-b134-dcc060f303cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8467478b-736f-4d17-b134-dcc060f303cd
Content-Type: application/json

--- request body ---
{"handle":"qa-d8fbe9152226","displayName":"QA d8fbe9152226","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-8467478b-736f-4d17-b134-dcc060f303cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 544
RateLimit-Reset: 9
Location: /v1/accounts/qa-d8fbe9152226
X-Served-Region: eu
Content-Length: 181

{"id":"acc_188865c1-8d9d-41c8-b05c-a776bfc48ed8","handle":"qa-d8fbe9152226","displayName":"QA d8fbe9152226","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.245130378Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-0c801fce-7710-4205-8cc4-772bca03aa56

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c801fce-7710-4205-8cc4-772bca03aa56
Content-Type: application/json

--- request body ---
{"handle":"qa-be3c64482c03","displayName":"QA be3c64482c03","password":"****","region":"eu"}

--- response: 201 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c801fce-7710-4205-8cc4-772bca03aa56
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
Location: /v1/accounts/qa-be3c64482c03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e7b798c3-38a9-41ff-9959-3570fd9b2858","handle":"qa-be3c64482c03","displayName":"QA be3c64482c03","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.272311418Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-b068d0fa-3c5f-46dd-bc05-1522f9dbd42b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b068d0fa-3c5f-46dd-bc05-1522f9dbd42b
Content-Type: application/json

--- request body ---
{"handle":"qa-96d4a5468eef","displayName":"QA 96d4a5468eef","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b068d0fa-3c5f-46dd-bc05-1522f9dbd42b
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
Location: /v1/accounts/qa-96d4a5468eef
X-Served-Region: eu
Content-Length: 181

{"id":"acc_409b1794-75b2-4b03-8b8e-fce1e0d263ba","handle":"qa-96d4a5468eef","displayName":"QA 96d4a5468eef","region":"eu","role":"user","createdAt":"2026-11-14T09:05:10.301260520Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-52d1f80d-1dc3-4344-8388-fb79502edab0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52d1f80d-1dc3-4344-8388-fb79502edab0
Content-Type: application/json

--- request body ---
{"handle":"qa-d8fbe9152226","password":"****"}

--- response: 200 in 40 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-52d1f80d-1dc3-4344-8388-fb79502edab0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 533
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_188865c1-8d9d-41c8-b05c-a776bfc48ed8"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-1be06409-8d93-4323-82c2-ad05f7627702

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1be06409-8d93-4323-82c2-ad05f7627702
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-be3c64482c03","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-1be06409-8d93-4323-82c2-ad05f7627702
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
Location: /v1/conversations/cnv_77b183ac-356d-4413-88d5-e5b96d6c0474
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_77b183ac-356d-4413-88d5-e5b96d6c0474","subject":"Error contract","status":"open","region":"eu","participants":["qa-d8fbe9152226","qa-be3c64482c03"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:10.377116778Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-5c928883-719d-4128-ae84-beff4703f9e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c928883-719d-4128-ae84-beff4703f9e8
Content-Type: application/json

--- request body ---
{"handle":"qa-96d4a5468eef","password":"****"}

--- response: 200 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c928883-719d-4128-ae84-beff4703f9e8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 527
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_409b1794-75b2-4b03-8b8e-fce1e0d263ba"}
```

## 7. GET /v1/conversations/{id}

```text
#7 GET http://localhost:7070/v1/conversations/cnv_77b183ac-356d-4413-88d5-e5b96d6c0474
correlation: qa-f17a199b-fcc8-4469-876a-231d9c41acf5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f17a199b-fcc8-4469-876a-231d9c41acf5
Content-Type: application/json

--- response: 403 in 21 ms ---
Date: Sat, 14 Nov 2026 09:05:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f17a199b-fcc8-4469-876a-231d9c41acf5
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_77b183ac-356d-4413-88d5-e5b96d6c0474","correlationId":"qa-f17a199b-fcc8-4469-876a-231d9c41acf5"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ab57ffc9-8eb6-4933-a0e9-f92ae564a6ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab57ffc9-8eb6-4933-a0e9-f92ae564a6ce
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ab57ffc9-8eb6-4933-a0e9-f92ae564a6ce
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
correlation: qa-10538018-f3ff-4dca-bd0c-57d4f44cbcce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10538018-f3ff-4dca-bd0c-57d4f44cbcce
Content-Type: application/json

--- request body ---
{"handle":"qa-96d4a5468eef","password":"****"}

--- response: 401 in 22 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-10538018-f3ff-4dca-bd0c-57d4f44cbcce
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-10538018-f3ff-4dca-bd0c-57d4f44cbcce"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c8d1b06d-9792-4212-bba4-030045b5f9ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8d1b06d-9792-4212-bba4-030045b5f9ca
Content-Type: application/json

--- request body ---
{"handle":"qa-be3c64482c03","password":"****"}

--- response: 200 in 46 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8d1b06d-9792-4212-bba4-030045b5f9ca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e7b798c3-38a9-41ff-9959-3570fd9b2858"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-15a30801-2fff-46ab-9527-6ad8d7bf64ec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-15a30801-2fff-46ab-9527-6ad8d7bf64ec
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-15a30801-2fff-46ab-9527-6ad8d7bf64ec
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
correlation: qa-1d06b03f-ea8f-40df-9003-010767affc62

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1d06b03f-ea8f-40df-9003-010767affc62
Content-Type: application/json

--- request body ---
{"handle":"qa-be3c64482c03","password":"****"}

--- response: 401 in 25 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1d06b03f-ea8f-40df-9003-010767affc62
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 491
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1d06b03f-ea8f-40df-9003-010767affc62"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-0bcbda9a-2e26-44f3-a604-5806330d692f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0bcbda9a-2e26-44f3-a604-5806330d692f
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: text/plain
X-Correlation-Id: qa-0bcbda9a-2e26-44f3-a604-5806330d692f
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
correlation: qa-45c5161f-0392-4902-8d0f-f88d7ce9854a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-45c5161f-0392-4902-8d0f-f88d7ce9854a
Content-Type: application/json

--- request body ---
{"handle":"qa-d8fbe9152226","password":"****"}

--- response: 401 in 23 ms ---
Date: Sat, 14 Nov 2026 09:05:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-45c5161f-0392-4902-8d0f-f88d7ce9854a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 480
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-45c5161f-0392-4902-8d0f-f88d7ce9854a"}
```
