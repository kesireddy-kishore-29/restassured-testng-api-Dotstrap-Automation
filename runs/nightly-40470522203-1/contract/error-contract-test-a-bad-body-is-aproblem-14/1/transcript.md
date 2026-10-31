# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations/{id}/messages, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[14]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 25 | `qa-8cb12db4-99a4-4db6-85fd-6abc13b70355` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-edb5d46c-be9d-4b87-bcac-0ab1a44e4adf` |
| 3 | `POST /v1/auth/token` | 200 | 33 | `qa-0e1c4472-204a-4c55-ab6a-aec0bef255e9` |
| 4 | `POST /v1/conversations` | 201 | 14 | `qa-ba14f2e3-666e-4b4e-ae99-848bf3590055` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 38 | `qa-164bd0ac-7756-4594-a411-435267bc30d8` |
| 6 | `POST /v1/auth/token` | 200 | 21 | `qa-6aa62fbb-a518-42d3-9aae-0e79ff6f65d8` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8eae9e30-f583-4ec7-81fb-3a735f261d14` |
| 8 | `POST /v1/auth/token` | 401 | 7 | `qa-f79a0440-bbea-4071-b7a8-69e5dc3165d9` |
| 9 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-27a7376d-acae-41dd-801c-49163cb30741` |
| 10 | `POST /v1/auth/token` | 401 | 5 | `qa-8ae6ac45-c371-4790-8638-955a8904ad95` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-8cb12db4-99a4-4db6-85fd-6abc13b70355

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cb12db4-99a4-4db6-85fd-6abc13b70355
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f45afd6833","displayName":"QA f4f45afd6833","password":"****","region":"eu"}

--- response: 201 in 25 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cb12db4-99a4-4db6-85fd-6abc13b70355
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 349
RateLimit-Reset: 6
Location: /v1/accounts/qa-f4f45afd6833
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b910030c-a8c3-43a4-8da9-96617bada32b","handle":"qa-f4f45afd6833","displayName":"QA f4f45afd6833","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.393887785Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-edb5d46c-be9d-4b87-bcac-0ab1a44e4adf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-edb5d46c-be9d-4b87-bcac-0ab1a44e4adf
Content-Type: application/json

--- request body ---
{"handle":"qa-4e0aaefd695e","displayName":"QA 4e0aaefd695e","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-edb5d46c-be9d-4b87-bcac-0ab1a44e4adf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 344
RateLimit-Reset: 6
Location: /v1/accounts/qa-4e0aaefd695e
X-Served-Region: eu
Content-Length: 181

{"id":"acc_b0c2277c-eec4-4842-99a3-2cea916ef4b3","handle":"qa-4e0aaefd695e","displayName":"QA 4e0aaefd695e","region":"eu","role":"user","createdAt":"2026-10-27T08:00:35.448177134Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-0e1c4472-204a-4c55-ab6a-aec0bef255e9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e1c4472-204a-4c55-ab6a-aec0bef255e9
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f45afd6833","password":"****"}

--- response: 200 in 33 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e1c4472-204a-4c55-ab6a-aec0bef255e9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 339
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b910030c-a8c3-43a4-8da9-96617bada32b"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-ba14f2e3-666e-4b4e-ae99-848bf3590055

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ba14f2e3-666e-4b4e-ae99-848bf3590055
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4e0aaefd695e","subject":"Error contract","message":"Hi"}

--- response: 201 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-ba14f2e3-666e-4b4e-ae99-848bf3590055
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
Location: /v1/conversations/cnv_bac607fe-d94e-4f2f-ba86-809df5022767
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_bac607fe-d94e-4f2f-ba86-809df5022767","subject":"Error contract","status":"open","region":"eu","participants":["qa-f4f45afd6833","qa-4e0aaefd695e"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:35.521171130Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_bac607fe-d94e-4f2f-ba86-809df5022767/messages
correlation: qa-164bd0ac-7756-4594-a411-435267bc30d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-164bd0ac-7756-4594-a411-435267bc30d8
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 38 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-164bd0ac-7756-4594-a411-435267bc30d8
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
Content-Length: 363

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_bac607fe-d94e-4f2f-ba86-809df5022767/messages","correlationId":"qa-164bd0ac-7756-4594-a411-435267bc30d8","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-6aa62fbb-a518-42d3-9aae-0e79ff6f65d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6aa62fbb-a518-42d3-9aae-0e79ff6f65d8
Content-Type: application/json

--- request body ---
{"handle":"qa-4e0aaefd695e","password":"****"}

--- response: 200 in 21 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/json
X-Correlation-Id: qa-6aa62fbb-a518-42d3-9aae-0e79ff6f65d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 322
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_b0c2277c-eec4-4842-99a3-2cea916ef4b3"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8eae9e30-f583-4ec7-81fb-3a735f261d14

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8eae9e30-f583-4ec7-81fb-3a735f261d14
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8eae9e30-f583-4ec7-81fb-3a735f261d14
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
correlation: qa-f79a0440-bbea-4071-b7a8-69e5dc3165d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f79a0440-bbea-4071-b7a8-69e5dc3165d9
Content-Type: application/json

--- request body ---
{"handle":"qa-4e0aaefd695e","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f79a0440-bbea-4071-b7a8-69e5dc3165d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 317
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f79a0440-bbea-4071-b7a8-69e5dc3165d9"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-27a7376d-acae-41dd-801c-49163cb30741

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27a7376d-acae-41dd-801c-49163cb30741
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: text/plain
X-Correlation-Id: qa-27a7376d-acae-41dd-801c-49163cb30741
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
correlation: qa-8ae6ac45-c371-4790-8638-955a8904ad95

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ae6ac45-c371-4790-8638-955a8904ad95
Content-Type: application/json

--- request body ---
{"handle":"qa-f4f45afd6833","password":"****"}

--- response: 401 in 5 ms ---
Date: Tue, 27 Oct 2026 08:00:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8ae6ac45-c371-4790-8638-955a8904ad95
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 314
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8ae6ac45-c371-4790-8638-955a8904ad95"}
```
