# Transcript: Every conversation operation answers an unknown id with a 404 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#unknownConversationIsA404[1]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 5 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-e3bc5201-8edc-478d-b109-e136f06a5b37` |
| 2 | `POST /v1/auth/token` | 200 | 5 | `qa-508a8faa-d242-47d0-8af4-a18fdf64ac19` |
| 3 | `GET /v1/conversations/{id}/messages` | 404 | 6 | `qa-718e1942-5908-46a3-ae41-4b4d10f33600` |
| 4 | `DELETE /v1/accounts/me` | 204 | 12 | `qa-2735fcaf-bce6-4086-ab71-b9caa69f2a99` |
| 5 | `POST /v1/auth/token` | 401 | 7 | `qa-e1b7bcbc-7a58-4cac-9dcf-19fa6cc3f0a1` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-e3bc5201-8edc-478d-b109-e136f06a5b37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e3bc5201-8edc-478d-b109-e136f06a5b37
Content-Type: application/json

--- request body ---
{"handle":"qa-888035713f4c","displayName":"QA 888035713f4c","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-e3bc5201-8edc-478d-b109-e136f06a5b37
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 307
RateLimit-Reset: 8
Location: /v1/accounts/qa-888035713f4c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_19cd4eca-547b-4974-8ae9-b16c88ed738b","handle":"qa-888035713f4c","displayName":"QA 888035713f4c","region":"eu","role":"user","createdAt":"2026-11-03T09:41:33.784784078Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-508a8faa-d242-47d0-8af4-a18fdf64ac19

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-508a8faa-d242-47d0-8af4-a18fdf64ac19
Content-Type: application/json

--- request body ---
{"handle":"qa-888035713f4c","password":"****"}

--- response: 200 in 5 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/json
X-Correlation-Id: qa-508a8faa-d242-47d0-8af4-a18fdf64ac19
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 304
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_19cd4eca-547b-4974-8ae9-b16c88ed738b"}
```

## 3. GET /v1/conversations/{id}/messages

```text
#3 GET http://localhost:7070/v1/conversations/cnv_does-not-exist/messages
correlation: qa-718e1942-5908-46a3-ae41-4b4d10f33600

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-718e1942-5908-46a3-ae41-4b4d10f33600
Content-Type: application/json

--- response: 404 in 6 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-718e1942-5908-46a3-ae41-4b4d10f33600
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
Content-Length: 262

{"type":"https://reference-service.example/problems/not-found","title":"Not found","status":404,"detail":"No conversation 'cnv_does-not-exist'.","instance":"/v1/conversations/cnv_does-not-exist/messages","correlationId":"qa-718e1942-5908-46a3-ae41-4b4d10f33600"}
```

## 4. DELETE /v1/accounts/me

```text
#4 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2735fcaf-bce6-4086-ab71-b9caa69f2a99

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2735fcaf-bce6-4086-ab71-b9caa69f2a99
Content-Type: application/json

--- response: 204 in 12 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2735fcaf-bce6-4086-ab71-b9caa69f2a99
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

## 5. POST /v1/auth/token

```text
#5 POST http://localhost:7070/v1/auth/token
correlation: qa-e1b7bcbc-7a58-4cac-9dcf-19fa6cc3f0a1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1b7bcbc-7a58-4cac-9dcf-19fa6cc3f0a1
Content-Type: application/json

--- request body ---
{"handle":"qa-888035713f4c","password":"****"}

--- response: 401 in 7 ms ---
Date: Tue, 03 Nov 2026 09:41:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1b7bcbc-7a58-4cac-9dcf-19fa6cc3f0a1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 294
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-e1b7bcbc-7a58-4cac-9dcf-19fa6cc3f0a1"}
```
