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
| 1 | `POST /v1/accounts` | 201 | 30 | `qa-53ce0e35-9898-406f-a257-2099eb86d427` |
| 2 | `POST /v1/accounts` | 201 | 43 | `qa-ac21668b-a702-4a8d-97b2-3d6cc06acfc0` |
| 3 | `POST /v1/accounts` | 201 | 65 | `qa-4c180faa-d0fd-4e13-9727-8023871afcbd` |
| 4 | `POST /v1/auth/token` | 200 | 30 | `qa-96245fc6-8f43-4521-a437-312aaf85d6a5` |
| 5 | `POST /v1/conversations` | 201 | 29 | `qa-9270d3b1-3be4-40ec-979b-cfa81032ddd6` |
| 6 | `POST /v1/auth/token` | 200 | 42 | `qa-478d2e67-306c-491e-9bd1-9b5421b6e30f` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 25 | `qa-3d74e51c-5188-488a-9562-521a0a335285` |
| 8 | `DELETE /v1/accounts/me` | 204 | 50 | `qa-a5509fc2-48ed-45f9-97c1-86f83ea1f0c0` |
| 9 | `POST /v1/auth/token` | 401 | 42 | `qa-863aec64-3f47-473d-85b7-d150935b9102` |
| 10 | `POST /v1/auth/token` | 200 | 49 | `qa-a7d952eb-4f44-4140-b259-84b17d523b60` |
| 11 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-450c9d30-409a-451b-a52e-ce83642bcaab` |
| 12 | `POST /v1/auth/token` | 401 | 41 | `qa-b666bddc-d9f9-48e7-876b-1cd688b36f6b` |
| 13 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-3c86d966-3388-42e2-9aa3-30e095e628f6` |
| 14 | `POST /v1/auth/token` | 401 | 51 | `qa-a787bdcf-839b-49f4-909c-55cca2a6da8a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-53ce0e35-9898-406f-a257-2099eb86d427

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53ce0e35-9898-406f-a257-2099eb86d427
Content-Type: application/json

--- request body ---
{"handle":"qa-59964edfb49c","displayName":"QA 59964edfb49c","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-53ce0e35-9898-406f-a257-2099eb86d427
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
Location: /v1/accounts/qa-59964edfb49c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_74f50109-e41c-4570-ac07-fe64197e4650","handle":"qa-59964edfb49c","displayName":"QA 59964edfb49c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.410436870Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-ac21668b-a702-4a8d-97b2-3d6cc06acfc0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ac21668b-a702-4a8d-97b2-3d6cc06acfc0
Content-Type: application/json

--- request body ---
{"handle":"qa-e8dd9a8995ea","displayName":"QA e8dd9a8995ea","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-ac21668b-a702-4a8d-97b2-3d6cc06acfc0
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
Location: /v1/accounts/qa-e8dd9a8995ea
X-Served-Region: eu
Content-Length: 181

{"id":"acc_ca4fbe0a-4775-4fa5-a902-64cffc8b0f3a","handle":"qa-e8dd9a8995ea","displayName":"QA e8dd9a8995ea","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.445936176Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-4c180faa-d0fd-4e13-9727-8023871afcbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c180faa-d0fd-4e13-9727-8023871afcbd
Content-Type: application/json

--- request body ---
{"handle":"qa-8c2ee053770c","displayName":"QA 8c2ee053770c","password":"****","region":"eu"}

--- response: 201 in 65 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c180faa-d0fd-4e13-9727-8023871afcbd
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
Location: /v1/accounts/qa-8c2ee053770c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_33563cec-d1ae-4636-9019-01b3730b62c6","handle":"qa-8c2ee053770c","displayName":"QA 8c2ee053770c","region":"eu","role":"user","createdAt":"2026-11-06T09:30:31.561104464Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-96245fc6-8f43-4521-a437-312aaf85d6a5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96245fc6-8f43-4521-a437-312aaf85d6a5
Content-Type: application/json

--- request body ---
{"handle":"qa-59964edfb49c","password":"****"}

--- response: 200 in 30 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-96245fc6-8f43-4521-a437-312aaf85d6a5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 532
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_74f50109-e41c-4570-ac07-fe64197e4650"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-9270d3b1-3be4-40ec-979b-cfa81032ddd6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9270d3b1-3be4-40ec-979b-cfa81032ddd6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-e8dd9a8995ea","subject":"Error contract","message":"Hi"}

--- response: 201 in 29 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-9270d3b1-3be4-40ec-979b-cfa81032ddd6
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
Location: /v1/conversations/cnv_1e17ca53-2e9d-4f74-8cad-885f5e7be229
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_1e17ca53-2e9d-4f74-8cad-885f5e7be229","subject":"Error contract","status":"open","region":"eu","participants":["qa-59964edfb49c","qa-e8dd9a8995ea"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-06T09:30:31.670334666Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-478d2e67-306c-491e-9bd1-9b5421b6e30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-478d2e67-306c-491e-9bd1-9b5421b6e30f
Content-Type: application/json

--- request body ---
{"handle":"qa-8c2ee053770c","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-478d2e67-306c-491e-9bd1-9b5421b6e30f
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_33563cec-d1ae-4636-9019-01b3730b62c6"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_1e17ca53-2e9d-4f74-8cad-885f5e7be229/messages
correlation: qa-3d74e51c-5188-488a-9562-521a0a335285

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3d74e51c-5188-488a-9562-521a0a335285
Content-Type: application/json

--- response: 403 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3d74e51c-5188-488a-9562-521a0a335285
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_1e17ca53-2e9d-4f74-8cad-885f5e7be229/messages","correlationId":"qa-3d74e51c-5188-488a-9562-521a0a335285"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-a5509fc2-48ed-45f9-97c1-86f83ea1f0c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5509fc2-48ed-45f9-97c1-86f83ea1f0c0
Content-Type: application/json

--- response: 204 in 50 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-a5509fc2-48ed-45f9-97c1-86f83ea1f0c0
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
correlation: qa-863aec64-3f47-473d-85b7-d150935b9102

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-863aec64-3f47-473d-85b7-d150935b9102
Content-Type: application/json

--- request body ---
{"handle":"qa-8c2ee053770c","password":"****"}

--- response: 401 in 42 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-863aec64-3f47-473d-85b7-d150935b9102
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 512
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-863aec64-3f47-473d-85b7-d150935b9102"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a7d952eb-4f44-4140-b259-84b17d523b60

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a7d952eb-4f44-4140-b259-84b17d523b60
Content-Type: application/json

--- request body ---
{"handle":"qa-e8dd9a8995ea","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a7d952eb-4f44-4140-b259-84b17d523b60
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 500
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_ca4fbe0a-4775-4fa5-a902-64cffc8b0f3a"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-450c9d30-409a-451b-a52e-ce83642bcaab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-450c9d30-409a-451b-a52e-ce83642bcaab
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-450c9d30-409a-451b-a52e-ce83642bcaab
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
correlation: qa-b666bddc-d9f9-48e7-876b-1cd688b36f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b666bddc-d9f9-48e7-876b-1cd688b36f6b
Content-Type: application/json

--- request body ---
{"handle":"qa-e8dd9a8995ea","password":"****"}

--- response: 401 in 41 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b666bddc-d9f9-48e7-876b-1cd688b36f6b
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b666bddc-d9f9-48e7-876b-1cd688b36f6b"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-3c86d966-3388-42e2-9aa3-30e095e628f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c86d966-3388-42e2-9aa3-30e095e628f6
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-3c86d966-3388-42e2-9aa3-30e095e628f6
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
correlation: qa-a787bdcf-839b-49f4-909c-55cca2a6da8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a787bdcf-839b-49f4-909c-55cca2a6da8a
Content-Type: application/json

--- request body ---
{"handle":"qa-59964edfb49c","password":"****"}

--- response: 401 in 51 ms ---
Date: Fri, 06 Nov 2026 09:30:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a787bdcf-839b-49f4-909c-55cca2a6da8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-a787bdcf-839b-49f4-909c-55cca2a6da8a"}
```
