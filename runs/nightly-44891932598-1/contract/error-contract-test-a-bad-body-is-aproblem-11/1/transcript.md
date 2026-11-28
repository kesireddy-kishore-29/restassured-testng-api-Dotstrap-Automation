# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/conversations, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[11]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 26 | `qa-0d72a72f-e3f2-42ec-8b98-ac187855931b` |
| 2 | `POST /v1/accounts` | 201 | 35 | `qa-d281afe2-8e40-4193-b012-be68019c707f` |
| 3 | `POST /v1/auth/token` | 200 | 32 | `qa-7a300ead-d98d-4698-801a-f6a035475b03` |
| 4 | `POST /v1/conversations` | 201 | 26 | `qa-a0eded7e-6105-4c67-95b6-3540add74f8a` |
| 5 | `POST /v1/conversations` | 422 | 10 | `qa-f19a9d37-762c-4c72-a464-68aeca14d8f0` |
| 6 | `POST /v1/auth/token` | 200 | 39 | `qa-414ad842-d672-4fec-81d2-aae6a03e05a2` |
| 7 | `DELETE /v1/accounts/me` | 204 | 18 | `qa-61dfa670-b4bf-49a9-97fd-ebfd63e9363e` |
| 8 | `POST /v1/auth/token` | 401 | 24 | `qa-1ae9c45f-2cde-4210-ad2a-af7de8dacd33` |
| 9 | `DELETE /v1/accounts/me` | 204 | 34 | `qa-be4f1029-b81e-4f9c-a2a9-9c54bfd67668` |
| 10 | `POST /v1/auth/token` | 401 | 28 | `qa-856001cf-0092-43af-b5a5-36c8da77b0d1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-0d72a72f-e3f2-42ec-8b98-ac187855931b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d72a72f-e3f2-42ec-8b98-ac187855931b
Content-Type: application/json

--- request body ---
{"handle":"qa-308ae25927dc","displayName":"QA 308ae25927dc","password":"****","region":"eu"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-0d72a72f-e3f2-42ec-8b98-ac187855931b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 398
RateLimit-Reset: 7
Location: /v1/accounts/qa-308ae25927dc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_05faef5f-25c2-46c4-a287-48040a191399","handle":"qa-308ae25927dc","displayName":"QA 308ae25927dc","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.665320086Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d281afe2-8e40-4193-b012-be68019c707f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d281afe2-8e40-4193-b012-be68019c707f
Content-Type: application/json

--- request body ---
{"handle":"qa-fadd1b706794","displayName":"QA fadd1b706794","password":"****","region":"eu"}

--- response: 201 in 35 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-d281afe2-8e40-4193-b012-be68019c707f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 394
RateLimit-Reset: 7
Location: /v1/accounts/qa-fadd1b706794
X-Served-Region: eu
Content-Length: 181

{"id":"acc_73555d29-f2b0-470b-9cfc-0134bb22961f","handle":"qa-fadd1b706794","displayName":"QA fadd1b706794","region":"eu","role":"user","createdAt":"2026-11-21T09:57:11.726742136Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-7a300ead-d98d-4698-801a-f6a035475b03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a300ead-d98d-4698-801a-f6a035475b03
Content-Type: application/json

--- request body ---
{"handle":"qa-308ae25927dc","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a300ead-d98d-4698-801a-f6a035475b03
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 387
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_05faef5f-25c2-46c4-a287-48040a191399"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a0eded7e-6105-4c67-95b6-3540add74f8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a0eded7e-6105-4c67-95b6-3540add74f8a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fadd1b706794","subject":"Error contract","message":"Hi"}

--- response: 201 in 26 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/json
X-Correlation-Id: qa-a0eded7e-6105-4c67-95b6-3540add74f8a
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
Location: /v1/conversations/cnv_35cf8a18-00cd-465b-8815-4e2600db6d04
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_35cf8a18-00cd-465b-8815-4e2600db6d04","subject":"Error contract","status":"open","region":"eu","participants":["qa-308ae25927dc","qa-fadd1b706794"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:11.829855732Z"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-f19a9d37-762c-4c72-a464-68aeca14d8f0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f19a9d37-762c-4c72-a464-68aeca14d8f0
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-fadd1b706794","subject":" ","message":"Hi"}

--- response: 422 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f19a9d37-762c-4c72-a464-68aeca14d8f0
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
Content-Length: 315

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/conversations","correlationId":"qa-f19a9d37-762c-4c72-a464-68aeca14d8f0","errors":[{"field":"subject","message":"1-120 characters, not blank"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-414ad842-d672-4fec-81d2-aae6a03e05a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-414ad842-d672-4fec-81d2-aae6a03e05a2
Content-Type: application/json

--- request body ---
{"handle":"qa-fadd1b706794","password":"****"}

--- response: 200 in 39 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/json
X-Correlation-Id: qa-414ad842-d672-4fec-81d2-aae6a03e05a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 363
RateLimit-Reset: 6
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_73555d29-f2b0-470b-9cfc-0134bb22961f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-61dfa670-b4bf-49a9-97fd-ebfd63e9363e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61dfa670-b4bf-49a9-97fd-ebfd63e9363e
Content-Type: application/json

--- response: 204 in 18 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-61dfa670-b4bf-49a9-97fd-ebfd63e9363e
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
correlation: qa-1ae9c45f-2cde-4210-ad2a-af7de8dacd33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ae9c45f-2cde-4210-ad2a-af7de8dacd33
Content-Type: application/json

--- request body ---
{"handle":"qa-fadd1b706794","password":"****"}

--- response: 401 in 24 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1ae9c45f-2cde-4210-ad2a-af7de8dacd33
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 351
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-1ae9c45f-2cde-4210-ad2a-af7de8dacd33"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-be4f1029-b81e-4f9c-a2a9-9c54bfd67668

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-be4f1029-b81e-4f9c-a2a9-9c54bfd67668
Content-Type: application/json

--- response: 204 in 34 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: text/plain
X-Correlation-Id: qa-be4f1029-b81e-4f9c-a2a9-9c54bfd67668
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
correlation: qa-856001cf-0092-43af-b5a5-36c8da77b0d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-856001cf-0092-43af-b5a5-36c8da77b0d1
Content-Type: application/json

--- request body ---
{"handle":"qa-308ae25927dc","password":"****"}

--- response: 401 in 28 ms ---
Date: Sat, 21 Nov 2026 09:57:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-856001cf-0092-43af-b5a5-36c8da77b0d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 343
RateLimit-Reset: 6
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-856001cf-0092-43af-b5a5-36c8da77b0d1"}
```
