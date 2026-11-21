# Transcript: Every operation with a body answers bad JSON 400, not JSON 415, invalid 422 [POST /v1/accounts, 422]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#aBadBodyIsAProblem[5]` |
| Features | FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 10 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 53 | `qa-f767d465-6fdc-48b6-b981-9a4c35fd91cb` |
| 2 | `POST /v1/accounts` | 201 | 38 | `qa-6006b889-eecd-4d68-a2ed-ecbe54d8454a` |
| 3 | `POST /v1/auth/token` | 200 | 28 | `qa-78818e53-0495-45bb-a8d1-aba0100d1c77` |
| 4 | `POST /v1/conversations` | 201 | 13 | `qa-d5886ba0-8b7a-4c72-9484-036335cdce98` |
| 5 | `POST /v1/accounts` | 422 | 9 | `qa-af746a81-718f-4a8b-8b38-0546d4de66d1` |
| 6 | `POST /v1/auth/token` | 200 | 20 | `qa-0c8cf954-f1ab-4289-aa83-2cce1271ebfc` |
| 7 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-6062674d-8094-44ff-b23a-7a6502e9bbd9` |
| 8 | `POST /v1/auth/token` | 401 | 11 | `qa-b1120b9a-32a1-482a-bb9b-c7ea22518641` |
| 9 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-1eb61606-ab25-4e4d-b83a-735a77af0a28` |
| 10 | `POST /v1/auth/token` | 401 | 30 | `qa-6707da65-72b0-4c7f-9a0f-ac6ec7911b7f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-f767d465-6fdc-48b6-b981-9a4c35fd91cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f767d465-6fdc-48b6-b981-9a4c35fd91cb
Content-Type: application/json

--- request body ---
{"handle":"qa-1e4d5f4e15a0","displayName":"QA 1e4d5f4e15a0","password":"****","region":"eu"}

--- response: 201 in 53 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-f767d465-6fdc-48b6-b981-9a4c35fd91cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 473
RateLimit-Reset: 8
Location: /v1/accounts/qa-1e4d5f4e15a0
X-Served-Region: eu
Content-Length: 181

{"id":"acc_42612627-7ea6-4659-8764-6e29ebf2cab5","handle":"qa-1e4d5f4e15a0","displayName":"QA 1e4d5f4e15a0","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.438019352Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-6006b889-eecd-4d68-a2ed-ecbe54d8454a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6006b889-eecd-4d68-a2ed-ecbe54d8454a
Content-Type: application/json

--- request body ---
{"handle":"qa-773ec557606c","displayName":"QA 773ec557606c","password":"****","region":"eu"}

--- response: 201 in 38 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-6006b889-eecd-4d68-a2ed-ecbe54d8454a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 463
RateLimit-Reset: 8
Location: /v1/accounts/qa-773ec557606c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_6ce19b92-4b3c-47ca-a125-e88612fc034f","handle":"qa-773ec557606c","displayName":"QA 773ec557606c","region":"eu","role":"user","createdAt":"2026-11-15T09:36:09.485520851Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-78818e53-0495-45bb-a8d1-aba0100d1c77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78818e53-0495-45bb-a8d1-aba0100d1c77
Content-Type: application/json

--- request body ---
{"handle":"qa-1e4d5f4e15a0","password":"****"}

--- response: 200 in 28 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-78818e53-0495-45bb-a8d1-aba0100d1c77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 453
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_42612627-7ea6-4659-8764-6e29ebf2cab5"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-d5886ba0-8b7a-4c72-9484-036335cdce98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5886ba0-8b7a-4c72-9484-036335cdce98
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-773ec557606c","subject":"Error contract","message":"Hi"}

--- response: 201 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5886ba0-8b7a-4c72-9484-036335cdce98
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
Location: /v1/conversations/cnv_dff65dee-f159-450a-aa3e-9c602ba92712
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_dff65dee-f159-450a-aa3e-9c602ba92712","subject":"Error contract","status":"open","region":"eu","participants":["qa-1e4d5f4e15a0","qa-773ec557606c"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:09.562875652Z"}
```

## 5. POST /v1/accounts

```text
#5 POST http://localhost:7070/v1/accounts
correlation: qa-af746a81-718f-4a8b-8b38-0546d4de66d1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-af746a81-718f-4a8b-8b38-0546d4de66d1
Content-Type: application/json

--- request body ---
{"handle":"ab","displayName":"Name","password":"****","region":"eu"}

--- response: 422 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-af746a81-718f-4a8b-8b38-0546d4de66d1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 445
RateLimit-Reset: 8
Content-Length: 338

{"type":"https://reference-service.example/problems/validation-failed","title":"Validation failed","status":422,"detail":"One or more fields are invalid.","instance":"/v1/accounts","correlationId":"qa-af746a81-718f-4a8b-8b38-0546d4de66d1","errors":[{"field":"handle","message":"3-30 characters: a-z, 0-9 and '-', not starting with '-'"}]}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-0c8cf954-f1ab-4289-aa83-2cce1271ebfc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c8cf954-f1ab-4289-aa83-2cce1271ebfc
Content-Type: application/json

--- request body ---
{"handle":"qa-773ec557606c","password":"****"}

--- response: 200 in 20 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c8cf954-f1ab-4289-aa83-2cce1271ebfc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 421
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_6ce19b92-4b3c-47ca-a125-e88612fc034f"}
```

## 7. DELETE /v1/accounts/me

```text
#7 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-6062674d-8094-44ff-b23a-7a6502e9bbd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6062674d-8094-44ff-b23a-7a6502e9bbd9
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-6062674d-8094-44ff-b23a-7a6502e9bbd9
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
correlation: qa-b1120b9a-32a1-482a-bb9b-c7ea22518641

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1120b9a-32a1-482a-bb9b-c7ea22518641
Content-Type: application/json

--- request body ---
{"handle":"qa-773ec557606c","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b1120b9a-32a1-482a-bb9b-c7ea22518641
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 409
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-b1120b9a-32a1-482a-bb9b-c7ea22518641"}
```

## 9. DELETE /v1/accounts/me

```text
#9 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-1eb61606-ab25-4e4d-b83a-735a77af0a28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1eb61606-ab25-4e4d-b83a-735a77af0a28
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: text/plain
X-Correlation-Id: qa-1eb61606-ab25-4e4d-b83a-735a77af0a28
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

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-6707da65-72b0-4c7f-9a0f-ac6ec7911b7f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6707da65-72b0-4c7f-9a0f-ac6ec7911b7f
Content-Type: application/json

--- request body ---
{"handle":"qa-1e4d5f4e15a0","password":"****"}

--- response: 401 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6707da65-72b0-4c7f-9a0f-ac6ec7911b7f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 400
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6707da65-72b0-4c7f-9a0f-ac6ec7911b7f"}
```
