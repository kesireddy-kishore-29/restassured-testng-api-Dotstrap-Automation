# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 400]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[3]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 37 | `qa-fd44e251-178e-4d17-8aba-c07fe7ba83a8` |
| 2 | `POST /v1/accounts` | 201 | 55 | `qa-f743595d-50a0-41c5-bb6c-cbcefc7fb10a` |
| 3 | `POST /v1/auth/token` | 200 | 34 | `qa-b1a3df06-3fbf-471e-8354-4e089914965d` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-a9315b81-a86b-4008-904b-e2d1f35f4557` |
| 5 | `POST /v1/accounts` | 400 | 39 | `qa-08fc1b85-8da7-4f25-82ea-f3db97a4dab7` |
| 6 | `POST /v1/auth/token` | 200 | 49 | `qa-cd2f8375-3522-491f-bbb4-a01ba4e68b5c` |
| 7 | `DELETE /v1/accounts/me` | 204 | 32 | `qa-00e2080d-35b2-4168-b01a-1250a95f0b6d` |
| 8 | `POST /v1/auth/token` | 401 | 22 | `qa-3a68df36-8ca2-4c58-93fd-9cf3e753b8b6` |
| 9 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-2d47c3ce-2ea5-4669-a9e5-82579ad84338` |
| 10 | `POST /v1/auth/token` | 401 | 29 | `qa-36f7fe6c-2596-4c91-ac85-2b1259be292b` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-fd44e251-178e-4d17-8aba-c07fe7ba83a8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd44e251-178e-4d17-8aba-c07fe7ba83a8
Content-Type: application/json

--- request body ---
{"handle":"qa-87908756c800","displayName":"QA 87908756c800","password":"****","region":"eu"}

--- response: 201 in 37 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd44e251-178e-4d17-8aba-c07fe7ba83a8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 574
RateLimit-Reset: 9
Location: /v1/accounts/qa-87908756c800
X-Served-Region: eu
Content-Length: 181

{"id":"acc_59d62d5a-a9f1-4225-a54f-5a4f565bcc2e","handle":"qa-87908756c800","displayName":"QA 87908756c800","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.436498697Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f743595d-50a0-41c5-bb6c-cbcefc7fb10a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f743595d-50a0-41c5-bb6c-cbcefc7fb10a
Content-Type: application/json

--- request body ---
{"handle":"qa-09ce2eb483fe","displayName":"QA 09ce2eb483fe","password":"****","region":"eu"}

--- response: 201 in 55 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-f743595d-50a0-41c5-bb6c-cbcefc7fb10a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 560
RateLimit-Reset: 9
Location: /v1/accounts/qa-09ce2eb483fe
X-Served-Region: eu
Content-Length: 181

{"id":"acc_8da79b69-375f-4696-a372-9171d02d29ae","handle":"qa-09ce2eb483fe","displayName":"QA 09ce2eb483fe","region":"eu","role":"user","createdAt":"2026-10-27T08:00:32.502947727Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-b1a3df06-3fbf-471e-8354-4e089914965d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1a3df06-3fbf-471e-8354-4e089914965d
Content-Type: application/json

--- request body ---
{"handle":"qa-87908756c800","password":"****"}

--- response: 200 in 34 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1a3df06-3fbf-471e-8354-4e089914965d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 554
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_59d62d5a-a9f1-4225-a54f-5a4f565bcc2e"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-a9315b81-a86b-4008-904b-e2d1f35f4557

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9315b81-a86b-4008-904b-e2d1f35f4557
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-09ce2eb483fe","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9315b81-a86b-4008-904b-e2d1f35f4557
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
Location: /v1/conversations/cnv_2df0894c-b751-47a6-91ec-f4376a841a17
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_2df0894c-b751-47a6-91ec-f4376a841a17","subject":"Error contract","status":"open","region":"eu","participants":["qa-87908756c800","qa-09ce2eb483fe"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-27T08:00:32.579742859Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-08fc1b85-8da7-4f25-82ea-f3db97a4dab7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08fc1b85-8da7-4f25-82ea-f3db97a4dab7
Content-Type: application/json

--- request body ---
{"broken": 

--- response: 400 in 39 ms ---
Date: Tue, 27 Oct 2026 08:00:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08fc1b85-8da7-4f25-82ea-f3db97a4dab7
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
Content-Length: 253

{"type":"https://reference-service.example/problems/malformed-json","title":"Malformed JSON body","status":400,"detail":"The body is not valid JSON for this operation.","instance":"/v1/accounts","correlationId":"qa-08fc1b85-8da7-4f25-82ea-f3db97a4dab7"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-cd2f8375-3522-491f-bbb4-a01ba4e68b5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd2f8375-3522-491f-bbb4-a01ba4e68b5c
Content-Type: application/json

--- request body ---
{"handle":"qa-09ce2eb483fe","password":"****"}

--- response: 200 in 49 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd2f8375-3522-491f-bbb4-a01ba4e68b5c
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_8da79b69-375f-4696-a372-9171d02d29ae"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-00e2080d-35b2-4168-b01a-1250a95f0b6d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-00e2080d-35b2-4168-b01a-1250a95f0b6d
Content-Type: application/json

--- response: 204 in 32 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-00e2080d-35b2-4168-b01a-1250a95f0b6d
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
correlation: qa-3a68df36-8ca2-4c58-93fd-9cf3e753b8b6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a68df36-8ca2-4c58-93fd-9cf3e753b8b6
Content-Type: application/json

--- request body ---
{"handle":"qa-09ce2eb483fe","password":"****"}

--- response: 401 in 22 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a68df36-8ca2-4c58-93fd-9cf3e753b8b6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 501
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3a68df36-8ca2-4c58-93fd-9cf3e753b8b6"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2d47c3ce-2ea5-4669-a9e5-82579ad84338

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d47c3ce-2ea5-4669-a9e5-82579ad84338
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Tue, 27 Oct 2026 08:00:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2d47c3ce-2ea5-4669-a9e5-82579ad84338
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-36f7fe6c-2596-4c91-ac85-2b1259be292b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-36f7fe6c-2596-4c91-ac85-2b1259be292b
Content-Type: application/json

--- request body ---
{"handle":"qa-87908756c800","password":"****"}

--- response: 401 in 29 ms ---
Date: Tue, 27 Oct 2026 08:00:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-36f7fe6c-2596-4c91-ac85-2b1259be292b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 484
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-36f7fe6c-2596-4c91-ac85-2b1259be292b"}
```
