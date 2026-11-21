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
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-7490afe7-49e6-43fb-b322-e15aed358c2b` |
| 2 | `POST /v1/accounts` | 201 | 18 | `qa-8f081fc2-4bb0-4359-82c4-9ee8c46ba309` |
| 3 | `POST /v1/auth/token` | 200 | 36 | `qa-8c5e08e2-cef5-4a49-ae2a-cd3b7f6d6ca6` |
| 4 | `POST /v1/conversations` | 201 | 8 | `qa-3df30e27-afad-422e-ad24-04babb0dc777` |
| 5 | `POST /v1/conversations/{id}/messages` | 422 | 35 | `qa-435efcb1-7cf8-4ce5-a373-7181440da4c4` |
| 6 | `POST /v1/auth/token` | 200 | 37 | `qa-4c58ce22-99e6-4c67-8e55-fb809a818a27` |
| 7 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-77b3e614-dfa1-45a1-a9eb-aa7e869c690e` |
| 8 | `POST /v1/auth/token` | 401 | 9 | `qa-8f517029-26a3-448f-92a8-cf1ab2111b3c` |
| 9 | `DELETE /v1/accounts/me` | 204 | 27 | `qa-129349fc-15b9-494c-9022-4afdd1dec75c` |
| 10 | `POST /v1/auth/token` | 401 | 13 | `qa-410cee58-5e07-450f-b47d-3e957ab47558` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-7490afe7-49e6-43fb-b322-e15aed358c2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7490afe7-49e6-43fb-b322-e15aed358c2b
Content-Type: application/json

--- request body ---
{"handle":"qa-86c992dfa03f","displayName":"QA 86c992dfa03f","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-7490afe7-49e6-43fb-b322-e15aed358c2b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 354
RateLimit-Reset: 7
Location: /v1/accounts/qa-86c992dfa03f
X-Served-Region: eu
Content-Length: 181

{"id":"acc_d36cebef-7c23-45a1-a4c1-38a972ccc93f","handle":"qa-86c992dfa03f","displayName":"QA 86c992dfa03f","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.374740455Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-8f081fc2-4bb0-4359-82c4-9ee8c46ba309

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f081fc2-4bb0-4359-82c4-9ee8c46ba309
Content-Type: application/json

--- request body ---
{"handle":"qa-69b0b894734b","displayName":"QA 69b0b894734b","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f081fc2-4bb0-4359-82c4-9ee8c46ba309
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 348
RateLimit-Reset: 7
Location: /v1/accounts/qa-69b0b894734b
X-Served-Region: eu
Content-Length: 181

{"id":"acc_0be1a3db-8949-4bb8-ab51-83a6a59a53ce","handle":"qa-69b0b894734b","displayName":"QA 69b0b894734b","region":"eu","role":"user","createdAt":"2026-11-14T09:05:12.443486224Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-8c5e08e2-cef5-4a49-ae2a-cd3b7f6d6ca6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c5e08e2-cef5-4a49-ae2a-cd3b7f6d6ca6
Content-Type: application/json

--- request body ---
{"handle":"qa-86c992dfa03f","password":"****"}

--- response: 200 in 36 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c5e08e2-cef5-4a49-ae2a-cd3b7f6d6ca6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 341
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_d36cebef-7c23-45a1-a4c1-38a972ccc93f"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3df30e27-afad-422e-ad24-04babb0dc777

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3df30e27-afad-422e-ad24-04babb0dc777
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-69b0b894734b","subject":"Error contract","message":"Hi"}

--- response: 201 in 8 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-3df30e27-afad-422e-ad24-04babb0dc777
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
Location: /v1/conversations/cnv_21dd8ba5-bc6f-48a9-b9be-7e7232937aee
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_21dd8ba5-bc6f-48a9-b9be-7e7232937aee","subject":"Error contract","status":"open","region":"eu","participants":["qa-86c992dfa03f","qa-69b0b894734b"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-14T09:05:12.513708509Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_21dd8ba5-bc6f-48a9-b9be-7e7232937aee/messages
correlation: qa-435efcb1-7cf8-4ce5-a373-7181440da4c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-435efcb1-7cf8-4ce5-a373-7181440da4c4
Content-Type: application/json

--- request body ---
{"body":" "}

--- response: 422 in 35 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-435efcb1-7cf8-4ce5-a373-7181440da4c4
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

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations/cnv_21dd8ba5-bc6f-48a9-b9be-7e7232937aee/messages","correlationId":"qa-435efcb1-7cf8-4ce5-a373-7181440da4c4","errors":[{"field":"body","message":"1-2000 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-4c58ce22-99e6-4c67-8e55-fb809a818a27

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c58ce22-99e6-4c67-8e55-fb809a818a27
Content-Type: application/json

--- request body ---
{"handle":"qa-69b0b894734b","password":"****"}

--- response: 200 in 37 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c58ce22-99e6-4c67-8e55-fb809a818a27
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 320
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_0be1a3db-8949-4bb8-ab51-83a6a59a53ce"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-77b3e614-dfa1-45a1-a9eb-aa7e869c690e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-77b3e614-dfa1-45a1-a9eb-aa7e869c690e
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-77b3e614-dfa1-45a1-a9eb-aa7e869c690e
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
correlation: qa-8f517029-26a3-448f-92a8-cf1ab2111b3c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f517029-26a3-448f-92a8-cf1ab2111b3c
Content-Type: application/json

--- request body ---
{"handle":"qa-69b0b894734b","password":"****"}

--- response: 401 in 9 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8f517029-26a3-448f-92a8-cf1ab2111b3c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 310
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8f517029-26a3-448f-92a8-cf1ab2111b3c"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-129349fc-15b9-494c-9022-4afdd1dec75c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-129349fc-15b9-494c-9022-4afdd1dec75c
Content-Type: application/json

--- response: 204 in 27 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-129349fc-15b9-494c-9022-4afdd1dec75c
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
correlation: qa-410cee58-5e07-450f-b47d-3e957ab47558

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-410cee58-5e07-450f-b47d-3e957ab47558
Content-Type: application/json

--- request body ---
{"handle":"qa-86c992dfa03f","password":"****"}

--- response: 401 in 13 ms ---
Date: Sat, 14 Nov 2026 09:05:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-410cee58-5e07-450f-b47d-3e957ab47558
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 305
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-410cee58-5e07-450f-b47d-3e957ab47558"}
```
