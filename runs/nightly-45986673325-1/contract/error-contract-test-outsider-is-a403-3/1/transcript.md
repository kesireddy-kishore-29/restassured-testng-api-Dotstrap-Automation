# Transcript: Every conversation operation answers an outsider with a 403 problem [POST /v1/conversations/{id}/read]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[3]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 69 | `qa-d800319c-b99d-44b1-a1d8-6cc00ea871be` |
| 2 | `POST /v1/accounts` | 201 | 34 | `qa-a05d4d4e-5ba2-443e-8df0-0fe9c8df4d1f` |
| 3 | `POST /v1/accounts` | 201 | 51 | `qa-31c25049-a002-46ff-b0e1-53179ae36008` |
| 4 | `POST /v1/auth/token` | 200 | 17 | `qa-9ac54f1f-1a7e-444b-aca3-000f46a7dfa3` |
| 5 | `POST /v1/conversations` | 201 | 32 | `qa-179e36da-28f4-4c39-ab45-7ccb2d744e70` |
| 6 | `POST /v1/auth/token` | 200 | 29 | `qa-609489d9-9e96-4a33-96c6-0476fe93c212` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 10 | `qa-666707e0-dfdc-4a3a-a37d-3dc9a6b1cec9` |
| 8 | `DELETE /v1/accounts/me` | 204 | 51 | `qa-6555c54e-b1f3-4925-963a-27cfe7a3ffc8` |
| 9 | `POST /v1/auth/token` | 401 | 20 | `qa-b4ab03c3-095c-403a-9ebb-9f7cbf6a8260` |
| 10 | `POST /v1/auth/token` | 200 | 21 | `qa-c4ed087b-7640-4abb-a02e-962c24b336e0` |
| 11 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-9188653d-d88d-4ffa-9a3d-33e52bb35994` |
| 12 | `POST /v1/auth/token` | 401 | 16 | `qa-4b319f81-311a-4f74-b7ab-5af26fc32584` |
| 13 | `DELETE /v1/accounts/me` | 204 | 65 | `qa-6361c34b-f0e7-4d32-9541-e385a10ac33a` |
| 14 | `POST /v1/auth/token` | 401 | 73 | `qa-aa175241-7139-4a5e-a9ce-acd48eabc1d6` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-d800319c-b99d-44b1-a1d8-6cc00ea871be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d800319c-b99d-44b1-a1d8-6cc00ea871be
Content-Type: application/json

--- request body ---
{"handle":"qa-3ba64a29c4c0","displayName":"QA 3ba64a29c4c0","password":"****","region":"eu"}

--- response: 201 in 69 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d800319c-b99d-44b1-a1d8-6cc00ea871be
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
Location: /v1/accounts/qa-3ba64a29c4c0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_bc165416-c2dd-4ed6-a056-d98ba11469fb","handle":"qa-3ba64a29c4c0","displayName":"QA 3ba64a29c4c0","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.024037411Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-a05d4d4e-5ba2-443e-8df0-0fe9c8df4d1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a05d4d4e-5ba2-443e-8df0-0fe9c8df4d1f
Content-Type: application/json

--- request body ---
{"handle":"qa-9485fde9529c","displayName":"QA 9485fde9529c","password":"****","region":"eu"}

--- response: 201 in 34 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-a05d4d4e-5ba2-443e-8df0-0fe9c8df4d1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 9
Location: /v1/accounts/qa-9485fde9529c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_56823f97-0a2f-4eb3-a8b1-8da81cfa9cba","handle":"qa-9485fde9529c","displayName":"QA 9485fde9529c","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.101675488Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-31c25049-a002-46ff-b0e1-53179ae36008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31c25049-a002-46ff-b0e1-53179ae36008
Content-Type: application/json

--- request body ---
{"handle":"qa-16051f0f1ed0","displayName":"QA 16051f0f1ed0","password":"****","region":"eu"}

--- response: 201 in 51 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-31c25049-a002-46ff-b0e1-53179ae36008
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 540
RateLimit-Reset: 9
Location: /v1/accounts/qa-16051f0f1ed0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31def4a2-0970-4abb-a020-2cab90f17f71","handle":"qa-16051f0f1ed0","displayName":"QA 16051f0f1ed0","region":"eu","role":"user","createdAt":"2026-11-27T10:59:57.177424872Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-9ac54f1f-1a7e-444b-aca3-000f46a7dfa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ac54f1f-1a7e-444b-aca3-000f46a7dfa3
Content-Type: application/json

--- request body ---
{"handle":"qa-3ba64a29c4c0","password":"****"}

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ac54f1f-1a7e-444b-aca3-000f46a7dfa3
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_bc165416-c2dd-4ed6-a056-d98ba11469fb"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-179e36da-28f4-4c39-ab45-7ccb2d744e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-179e36da-28f4-4c39-ab45-7ccb2d744e70
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-9485fde9529c","subject":"Error contract","message":"Hi"}

--- response: 201 in 32 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-179e36da-28f4-4c39-ab45-7ccb2d744e70
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
Location: /v1/conversations/cnv_b808256c-a886-4ad2-9b23-9e6662f9f988
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b808256c-a886-4ad2-9b23-9e6662f9f988","subject":"Error contract","status":"open","region":"eu","participants":["qa-3ba64a29c4c0","qa-9485fde9529c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-27T10:59:57.265898813Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-609489d9-9e96-4a33-96c6-0476fe93c212

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-609489d9-9e96-4a33-96c6-0476fe93c212
Content-Type: application/json

--- request body ---
{"handle":"qa-16051f0f1ed0","password":"****"}

--- response: 200 in 29 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-609489d9-9e96-4a33-96c6-0476fe93c212
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31def4a2-0970-4abb-a020-2cab90f17f71"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_b808256c-a886-4ad2-9b23-9e6662f9f988/read
correlation: qa-666707e0-dfdc-4a3a-a37d-3dc9a6b1cec9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-666707e0-dfdc-4a3a-a37d-3dc9a6b1cec9
Content-Type: application/json

--- response: 403 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-666707e0-dfdc-4a3a-a37d-3dc9a6b1cec9
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
Content-Length: 290

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b808256c-a886-4ad2-9b23-9e6662f9f988/read","correlationId":"qa-666707e0-dfdc-4a3a-a37d-3dc9a6b1cec9"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6555c54e-b1f3-4925-963a-27cfe7a3ffc8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6555c54e-b1f3-4925-963a-27cfe7a3ffc8
Content-Type: application/json

--- response: 204 in 51 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6555c54e-b1f3-4925-963a-27cfe7a3ffc8
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
correlation: qa-b4ab03c3-095c-403a-9ebb-9f7cbf6a8260

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4ab03c3-095c-403a-9ebb-9f7cbf6a8260
Content-Type: application/json

--- request body ---
{"handle":"qa-16051f0f1ed0","password":"****"}

--- response: 401 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b4ab03c3-095c-403a-9ebb-9f7cbf6a8260
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b4ab03c3-095c-403a-9ebb-9f7cbf6a8260"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-c4ed087b-7640-4abb-a02e-962c24b336e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4ed087b-7640-4abb-a02e-962c24b336e0
Content-Type: application/json

--- request body ---
{"handle":"qa-9485fde9529c","password":"****"}

--- response: 200 in 21 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4ed087b-7640-4abb-a02e-962c24b336e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 509
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_56823f97-0a2f-4eb3-a8b1-8da81cfa9cba"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-9188653d-d88d-4ffa-9a3d-33e52bb35994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9188653d-d88d-4ffa-9a3d-33e52bb35994
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-9188653d-d88d-4ffa-9a3d-33e52bb35994
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
correlation: qa-4b319f81-311a-4f74-b7ab-5af26fc32584

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b319f81-311a-4f74-b7ab-5af26fc32584
Content-Type: application/json

--- request body ---
{"handle":"qa-9485fde9529c","password":"****"}

--- response: 401 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4b319f81-311a-4f74-b7ab-5af26fc32584
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 497
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-4b319f81-311a-4f74-b7ab-5af26fc32584"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6361c34b-f0e7-4d32-9541-e385a10ac33a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6361c34b-f0e7-4d32-9541-e385a10ac33a
Content-Type: application/json

--- response: 204 in 65 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6361c34b-f0e7-4d32-9541-e385a10ac33a
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
correlation: qa-aa175241-7139-4a5e-a9ce-acd48eabc1d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa175241-7139-4a5e-a9ce-acd48eabc1d6
Content-Type: application/json

--- request body ---
{"handle":"qa-3ba64a29c4c0","password":"****"}

--- response: 401 in 73 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa175241-7139-4a5e-a9ce-acd48eabc1d6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 477
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa175241-7139-4a5e-a9ce-acd48eabc1d6"}
```
