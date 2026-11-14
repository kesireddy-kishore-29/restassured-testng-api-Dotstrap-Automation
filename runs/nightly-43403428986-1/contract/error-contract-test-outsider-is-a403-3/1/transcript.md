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
| 1 | `POST /v1/accounts` | 201 | 24 | `qa-b6619fbc-3b38-4af2-839f-ff0ead4c327b` |
| 2 | `POST /v1/accounts` | 201 | 23 | `qa-66c2d35d-83f5-418d-b4e7-c5fe28c8ce76` |
| 3 | `POST /v1/accounts` | 201 | 15 | `qa-d97f5782-087f-4c6f-974a-716331f72e83` |
| 4 | `POST /v1/auth/token` | 200 | 24 | `qa-3072eb70-fd67-49d2-8861-f6827dcdc3a8` |
| 5 | `POST /v1/conversations` | 201 | 10 | `qa-5aca14e3-aa8e-41ee-875b-d643f71871b6` |
| 6 | `POST /v1/auth/token` | 200 | 12 | `qa-a10067b2-71fb-43df-8333-3fe953bc1ed5` |
| 7 | `POST /v1/conversations/{id}/read` | 403 | 31 | `qa-0a5dcf17-3689-46e0-a735-18bc97d803cb` |
| 8 | `DELETE /v1/accounts/me` | 204 | 20 | `qa-dce45620-4dee-453d-a3ed-b656407890f5` |
| 9 | `POST /v1/auth/token` | 401 | 8 | `qa-43827a73-14e2-4fe1-976a-d7c06c3d211c` |
| 10 | `POST /v1/auth/token` | 200 | 42 | `qa-a13474fb-c0c2-4973-b301-2145c81487a9` |
| 11 | `DELETE /v1/accounts/me` | 204 | 19 | `qa-c38f2b82-a9c1-412a-9432-321eaacd2f68` |
| 12 | `POST /v1/auth/token` | 401 | 31 | `qa-3a4b4bfd-a45a-4f6b-918e-bb81dd26a5cd` |
| 13 | `DELETE /v1/accounts/me` | 204 | 17 | `qa-96009bc4-9cc8-4e04-ac30-2036d085afa0` |
| 14 | `POST /v1/auth/token` | 401 | 17 | `qa-0b8e2f44-d63c-4e79-b97d-66cc33c2aeb7` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b6619fbc-3b38-4af2-839f-ff0ead4c327b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6619fbc-3b38-4af2-839f-ff0ead4c327b
Content-Type: application/json

--- request body ---
{"handle":"qa-02588d90857d","displayName":"QA 02588d90857d","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6619fbc-3b38-4af2-839f-ff0ead4c327b
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
Location: /v1/accounts/qa-02588d90857d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5e764584-1bab-48b7-853f-9dccc98eae97","handle":"qa-02588d90857d","displayName":"QA 02588d90857d","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.817865765Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-66c2d35d-83f5-418d-b4e7-c5fe28c8ce76

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66c2d35d-83f5-418d-b4e7-c5fe28c8ce76
Content-Type: application/json

--- request body ---
{"handle":"qa-896316abce3e","displayName":"QA 896316abce3e","password":"****","region":"eu"}

--- response: 201 in 23 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-66c2d35d-83f5-418d-b4e7-c5fe28c8ce76
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 538
RateLimit-Reset: 9
Location: /v1/accounts/qa-896316abce3e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_5d60c8a6-7e64-4d94-a527-bc4051fbb4b6","handle":"qa-896316abce3e","displayName":"QA 896316abce3e","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.876249040Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-d97f5782-087f-4c6f-974a-716331f72e83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d97f5782-087f-4c6f-974a-716331f72e83
Content-Type: application/json

--- request body ---
{"handle":"qa-3dbbf99e015d","displayName":"QA 3dbbf99e015d","password":"****","region":"eu"}

--- response: 201 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-d97f5782-087f-4c6f-974a-716331f72e83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 535
RateLimit-Reset: 9
Location: /v1/accounts/qa-3dbbf99e015d
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b195a47e-7cb2-4989-a39d-9068d2205999","handle":"qa-3dbbf99e015d","displayName":"QA 3dbbf99e015d","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.909358570Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-3072eb70-fd67-49d2-8861-f6827dcdc3a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3072eb70-fd67-49d2-8861-f6827dcdc3a8
Content-Type: application/json

--- request body ---
{"handle":"qa-02588d90857d","password":"****"}

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-3072eb70-fd67-49d2-8861-f6827dcdc3a8
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5e764584-1bab-48b7-853f-9dccc98eae97"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-5aca14e3-aa8e-41ee-875b-d643f71871b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5aca14e3-aa8e-41ee-875b-d643f71871b6
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-896316abce3e","subject":"Error contract","message":"Hi"}

--- response: 201 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5aca14e3-aa8e-41ee-875b-d643f71871b6
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
Location: /v1/conversations/cnv_45a0a432-4032-441c-8228-0c6154d6891e
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_45a0a432-4032-441c-8228-0c6154d6891e","subject":"Error contract","status":"open","region":"eu","participants":["qa-02588d90857d","qa-896316abce3e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-13T09:42:06.002352279Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-a10067b2-71fb-43df-8333-3fe953bc1ed5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a10067b2-71fb-43df-8333-3fe953bc1ed5
Content-Type: application/json

--- request body ---
{"handle":"qa-3dbbf99e015d","password":"****"}

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a10067b2-71fb-43df-8333-3fe953bc1ed5
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b195a47e-7cb2-4989-a39d-9068d2205999"}
```

## 7. POST /v1/conversations/{id}/read

```text
#7 POST http://localhost:7070/v1/conversations/cnv_45a0a432-4032-441c-8228-0c6154d6891e/read
correlation: qa-0a5dcf17-3689-46e0-a735-18bc97d803cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a5dcf17-3689-46e0-a735-18bc97d803cb
Content-Type: application/json

--- response: 403 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0a5dcf17-3689-46e0-a735-18bc97d803cb
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_45a0a432-4032-441c-8228-0c6154d6891e/read","correlationId":"qa-0a5dcf17-3689-46e0-a735-18bc97d803cb"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-dce45620-4dee-453d-a3ed-b656407890f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dce45620-4dee-453d-a3ed-b656407890f5
Content-Type: application/json

--- response: 204 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-dce45620-4dee-453d-a3ed-b656407890f5
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
correlation: qa-43827a73-14e2-4fe1-976a-d7c06c3d211c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-43827a73-14e2-4fe1-976a-d7c06c3d211c
Content-Type: application/json

--- request body ---
{"handle":"qa-3dbbf99e015d","password":"****"}

--- response: 401 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-43827a73-14e2-4fe1-976a-d7c06c3d211c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-43827a73-14e2-4fe1-976a-d7c06c3d211c"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-a13474fb-c0c2-4973-b301-2145c81487a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a13474fb-c0c2-4973-b301-2145c81487a9
Content-Type: application/json

--- request body ---
{"handle":"qa-896316abce3e","password":"****"}

--- response: 200 in 42 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a13474fb-c0c2-4973-b301-2145c81487a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 505
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_5d60c8a6-7e64-4d94-a527-bc4051fbb4b6"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c38f2b82-a9c1-412a-9432-321eaacd2f68

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c38f2b82-a9c1-412a-9432-321eaacd2f68
Content-Type: application/json

--- response: 204 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c38f2b82-a9c1-412a-9432-321eaacd2f68
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
correlation: qa-3a4b4bfd-a45a-4f6b-918e-bb81dd26a5cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a4b4bfd-a45a-4f6b-918e-bb81dd26a5cd
Content-Type: application/json

--- request body ---
{"handle":"qa-896316abce3e","password":"****"}

--- response: 401 in 31 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a4b4bfd-a45a-4f6b-918e-bb81dd26a5cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 490
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a4b4bfd-a45a-4f6b-918e-bb81dd26a5cd"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-96009bc4-9cc8-4e04-ac30-2036d085afa0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96009bc4-9cc8-4e04-ac30-2036d085afa0
Content-Type: application/json

--- response: 204 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-96009bc4-9cc8-4e04-ac30-2036d085afa0
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
correlation: qa-0b8e2f44-d63c-4e79-b97d-66cc33c2aeb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b8e2f44-d63c-4e79-b97d-66cc33c2aeb7
Content-Type: application/json

--- request body ---
{"handle":"qa-02588d90857d","password":"****"}

--- response: 401 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0b8e2f44-d63c-4e79-b97d-66cc33c2aeb7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 475
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-0b8e2f44-d63c-4e79-b97d-66cc33c2aeb7"}
```
