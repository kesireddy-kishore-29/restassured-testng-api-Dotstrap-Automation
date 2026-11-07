# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[12]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-246d05e8-7fdc-40b2-a6e0-8c28ada11bbf` |
| 2 | `POST /v1/accounts` | 201 | 13 | `qa-752c6bcb-bb7a-4051-9386-9feb33db3040` |
| 3 | `POST /v1/auth/token` | 200 | 23 | `qa-73a6b195-347a-41eb-8bb3-932c94e24bfc` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-e6cdb0ac-8b4b-4383-b3ef-d23ad828f683` |
| 5 | `POST /v1/conversations/{id}/messages` | 400 | 5 | `qa-6046e666-1106-4469-91b4-e025e50a4dc4` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-98d182b0-edd6-4d90-a307-66986a6b69e1` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-ffd1cee9-0f30-4a03-a3db-ab57f9a0adf8` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-cfa048e1-103e-4282-8434-dc2dea081d4f` |
| 9 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-4847e6c3-6ea4-4541-b76b-48633299424f` |
| 10 | `POST /v1/auth/token` | 401 | 10 | `qa-5b0ff937-cb9b-4ee9-aa4c-f762047bca28` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-246d05e8-7fdc-40b2-a6e0-8c28ada11bbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-246d05e8-7fdc-40b2-a6e0-8c28ada11bbf
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca3b31eb587","displayName":"QA 6ca3b31eb587","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-246d05e8-7fdc-40b2-a6e0-8c28ada11bbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 396
RateLimit-Reset: 8
Location: /v1/accounts/qa-6ca3b31eb587
X-Served-Region: eu
Content-Length: 181

{"id":"acc_df1db16f-97e6-4013-a27c-b91111363b3c","handle":"qa-6ca3b31eb587","displayName":"QA 6ca3b31eb587","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.060571571Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-752c6bcb-bb7a-4051-9386-9feb33db3040

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-752c6bcb-bb7a-4051-9386-9feb33db3040
Content-Type: application/json

--- request body ---
{"handle":"qa-712f1ddd8b2b","displayName":"QA 712f1ddd8b2b","password":"****","region":"eu"}

--- response: 201 in 13 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-752c6bcb-bb7a-4051-9386-9feb33db3040
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 392
RateLimit-Reset: 8
Location: /v1/accounts/qa-712f1ddd8b2b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6d614f4f-01dd-4b8c-9298-64597257da91","handle":"qa-712f1ddd8b2b","displayName":"QA 712f1ddd8b2b","region":"eu","role":"user","createdAt":"2026-11-04T09:28:03.085576684Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-73a6b195-347a-41eb-8bb3-932c94e24bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73a6b195-347a-41eb-8bb3-932c94e24bfc
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca3b31eb587","password":"****"}

--- response: 200 in 23 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-73a6b195-347a-41eb-8bb3-932c94e24bfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_df1db16f-97e6-4013-a27c-b91111363b3c"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-e6cdb0ac-8b4b-4383-b3ef-d23ad828f683

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e6cdb0ac-8b4b-4383-b3ef-d23ad828f683
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-712f1ddd8b2b","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-e6cdb0ac-8b4b-4383-b3ef-d23ad828f683
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
Location: /v1/conversations/cnv_a3590e2d-db2d-456c-9c41-82cc7a07c897
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_a3590e2d-db2d-456c-9c41-82cc7a07c897","subject":"Error contract","status":"open","region":"eu","participants":["qa-6ca3b31eb587","qa-712f1ddd8b2b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-04T09:28:03.156502638Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_a3590e2d-db2d-456c-9c41-82cc7a07c897/messages
correlation: qa-6046e666-1106-4469-91b4-e025e50a4dc4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6046e666-1106-4469-91b4-e025e50a4dc4
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 5 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6046e666-1106-4469-91b4-e025e50a4dc4
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
Content-Length: 308

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/conversations/cnv_a3590e2d-db2d-456c-9c41-82cc7a07c897/messages","correlationId":"qa-6046e666-1106-4469-91b4-e025e50a4dc4"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-98d182b0-edd6-4d90-a307-66986a6b69e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-98d182b0-edd6-4d90-a307-66986a6b69e1
Content-Type: application/json

--- request body ---
{"handle":"qa-712f1ddd8b2b","password":"****"}

--- response: 200 in 21 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/json
X-Correlation-Id: qa-98d182b0-edd6-4d90-a307-66986a6b69e1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 364
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6d614f4f-01dd-4b8c-9298-64597257da91"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ffd1cee9-0f30-4a03-a3db-ab57f9a0adf8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ffd1cee9-0f30-4a03-a3db-ab57f9a0adf8
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ffd1cee9-0f30-4a03-a3db-ab57f9a0adf8
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

## 8. POST /v1/auth/token

```text
#8 POST http://localhost:7070/v1/auth/token
correlation: qa-cfa048e1-103e-4282-8434-dc2dea081d4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfa048e1-103e-4282-8434-dc2dea081d4f
Content-Type: application/json

--- request body ---
{"handle":"qa-712f1ddd8b2b","password":"****"}

--- response: 401 in 9 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cfa048e1-103e-4282-8434-dc2dea081d4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 359
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-cfa048e1-103e-4282-8434-dc2dea081d4f"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4847e6c3-6ea4-4541-b76b-48633299424f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4847e6c3-6ea4-4541-b76b-48633299424f
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4847e6c3-6ea4-4541-b76b-48633299424f
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
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5b0ff937-cb9b-4ee9-aa4c-f762047bca28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b0ff937-cb9b-4ee9-aa4c-f762047bca28
Content-Type: application/json

--- request body ---
{"handle":"qa-6ca3b31eb587","password":"****"}

--- response: 401 in 10 ms ---
Date: Wed, 04 Nov 2026 09:28:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5b0ff937-cb9b-4ee9-aa4c-f762047bca28
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-5b0ff937-cb9b-4ee9-aa4c-f762047bca28"}
```
