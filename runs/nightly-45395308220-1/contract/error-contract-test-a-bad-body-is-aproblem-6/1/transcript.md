# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [PATCH /v1/accounts/me, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[6]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 44 | `qa-bda7e304-5d4d-47b1-aa43-27f93da4acf6` |
| 2 | `POST /v1/accounts` | 201 | 54 | `qa-39665a00-de41-4195-b32f-654b7f65207f` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-3f936447-34da-48a6-b21f-aee3b722ba12` |
| 4 | `POST /v1/conversations` | 201 | 42 | `qa-c98842c6-48c0-4b5a-9475-6a2167107b47` |
| 5 | `PATCH /v1/accounts/me` | 400 | 23 | `qa-a36041a5-c6f9-4880-97bf-1c2982eb65dc` |
| 6 | `POST /v1/auth/token` | 200 | 22 | `qa-b366bf0f-cb98-449e-be39-61a48a68ff65` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-6253681d-4504-4548-b625-c7abdd306518` |
| 8 | `POST /v1/auth/token` | 401 | 15 | `qa-ee3f8749-9deb-4c06-9c05-23e4a94fa92a` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-21c6250c-32c4-46ff-a6f7-af1b5fdd5f05` |
| 10 | `POST /v1/auth/token` | 401 | 12 | `qa-2e48de04-920c-4580-97f4-d00b38d21bfc` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-bda7e304-5d4d-47b1-aa43-27f93da4acf6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bda7e304-5d4d-47b1-aa43-27f93da4acf6
Content-Type: application/json

--- request body ---
{"handle":"qa-3bfc6103fa9f","displayName":"QA 3bfc6103fa9f","password":"****","region":"eu"}

--- response: 201 in 44 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-bda7e304-5d4d-47b1-aa43-27f93da4acf6
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
Location: /v1/accounts/qa-3bfc6103fa9f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_beaa6560-dde6-490b-a6d6-2f4626b015ac","handle":"qa-3bfc6103fa9f","displayName":"QA 3bfc6103fa9f","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.547955143Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-39665a00-de41-4195-b32f-654b7f65207f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39665a00-de41-4195-b32f-654b7f65207f
Content-Type: application/json

--- request body ---
{"handle":"qa-f33348c7f49a","displayName":"QA f33348c7f49a","password":"****","region":"eu"}

--- response: 201 in 54 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-39665a00-de41-4195-b32f-654b7f65207f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 460
RateLimit-Reset: 8
Location: /v1/accounts/qa-f33348c7f49a
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1fad18f8-b14a-4100-bc37-86cd9058108f","handle":"qa-f33348c7f49a","displayName":"QA f33348c7f49a","region":"eu","role":"user","createdAt":"2026-11-24T12:38:14.618001129Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-3f936447-34da-48a6-b21f-aee3b722ba12

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f936447-34da-48a6-b21f-aee3b722ba12
Content-Type: application/json

--- request body ---
{"handle":"qa-3bfc6103fa9f","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f936447-34da-48a6-b21f-aee3b722ba12
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 448
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_beaa6560-dde6-490b-a6d6-2f4626b015ac"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-c98842c6-48c0-4b5a-9475-6a2167107b47

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c98842c6-48c0-4b5a-9475-6a2167107b47
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-f33348c7f49a","subject":"Error contract","message":"Hi"}

--- response: 201 in 42 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-c98842c6-48c0-4b5a-9475-6a2167107b47
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
Location: /v1/conversations/cnv_5cf512cb-38f8-421a-8707-5c3f02cceea2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_5cf512cb-38f8-421a-8707-5c3f02cceea2","subject":"Error contract","status":"open","region":"eu","participants":["qa-3bfc6103fa9f","qa-f33348c7f49a"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-24T12:38:14.721293126Z"}
```

## 5. PATCH /v1/accounts/me

```text
#5 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-a36041a5-c6f9-4880-97bf-1c2982eb65dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36041a5-c6f9-4880-97bf-1c2982eb65dc
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 23 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a36041a5-c6f9-4880-97bf-1c2982eb65dc
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
Content-Length: 256

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts/me","correlationId":"qa-a36041a5-c6f9-4880-97bf-1c2982eb65dc"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-b366bf0f-cb98-449e-be39-61a48a68ff65

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b366bf0f-cb98-449e-be39-61a48a68ff65
Content-Type: application/json

--- request body ---
{"handle":"qa-f33348c7f49a","password":"****"}

--- response: 200 in 22 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/json
X-Correlation-Id: qa-b366bf0f-cb98-449e-be39-61a48a68ff65
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 435
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1fad18f8-b14a-4100-bc37-86cd9058108f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6253681d-4504-4548-b625-c7abdd306518

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6253681d-4504-4548-b625-c7abdd306518
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6253681d-4504-4548-b625-c7abdd306518
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
correlation: qa-ee3f8749-9deb-4c06-9c05-23e4a94fa92a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee3f8749-9deb-4c06-9c05-23e4a94fa92a
Content-Type: application/json

--- request body ---
{"handle":"qa-f33348c7f49a","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee3f8749-9deb-4c06-9c05-23e4a94fa92a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 425
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-ee3f8749-9deb-4c06-9c05-23e4a94fa92a"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-21c6250c-32c4-46ff-a6f7-af1b5fdd5f05

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21c6250c-32c4-46ff-a6f7-af1b5fdd5f05
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: text/plain
X-Correlation-Id: qa-21c6250c-32c4-46ff-a6f7-af1b5fdd5f05
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
correlation: qa-2e48de04-920c-4580-97f4-d00b38d21bfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e48de04-920c-4580-97f4-d00b38d21bfc
Content-Type: application/json

--- request body ---
{"handle":"qa-3bfc6103fa9f","password":"****"}

--- response: 401 in 12 ms ---
Date: Tue, 24 Nov 2026 12:38:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2e48de04-920c-4580-97f4-d00b38d21bfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 417
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2e48de04-920c-4580-97f4-d00b38d21bfc"}
```
