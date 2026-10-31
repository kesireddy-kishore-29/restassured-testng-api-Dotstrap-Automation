# Transcript: Every conversation operation answers an outsider with a 403 problem [GET /v1/conversations/{id}/messages]

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#outsiderIsA403[1]` |
| Features | FEAT-AUTHZ-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 14 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 58 | `qa-1ae17ea4-d485-4089-b506-ffef1608690b` |
| 2 | `POST /v1/accounts` | 201 | 11 | `qa-d6eb0926-8999-4e10-a0f6-94c9dff0a529` |
| 3 | `POST /v1/accounts` | 201 | 63 | `qa-aa97af1a-7f06-40da-a4d9-ec3280a6b9a6` |
| 4 | `POST /v1/auth/token` | 200 | 19 | `qa-abd02ea0-73e0-4741-9910-4ee2a433dc7a` |
| 5 | `POST /v1/conversations` | 201 | 23 | `qa-84215e5e-2900-45dc-a2ac-5518eefca1d7` |
| 6 | `POST /v1/auth/token` | 200 | 9 | `qa-ee714d32-0e9e-4370-98e4-23c223535c45` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 8 | `qa-a05c32b3-70a8-4cd4-8de9-afcdb9a20bd1` |
| 8 | `DELETE /v1/accounts/me` | 204 | 36 | `qa-13167275-30ed-4595-9855-4fa7ede19a52` |
| 9 | `POST /v1/auth/token` | 401 | 21 | `qa-db16ef6f-5386-483c-b58e-4eb9ca3878ed` |
| 10 | `POST /v1/auth/token` | 200 | 32 | `qa-5c28bb48-0b1e-43a5-a831-c51f9860ff0f` |
| 11 | `DELETE /v1/accounts/me` | 204 | 28 | `qa-e8eb24f8-3cd4-40a8-b29b-8d2a3690e30f` |
| 12 | `POST /v1/auth/token` | 401 | 42 | `qa-f8bff442-5630-468c-bf65-749be7b1ea86` |
| 13 | `DELETE /v1/accounts/me` | 204 | 42 | `qa-4b3ef11e-9f6c-459b-a6dc-42c601954e33` |
| 14 | `POST /v1/auth/token` | 401 | 33 | `qa-47c3877f-84c1-4091-b1b0-df10b8a9baf2` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-1ae17ea4-d485-4089-b506-ffef1608690b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1ae17ea4-d485-4089-b506-ffef1608690b
Content-Type: application/json

--- request body ---
{"handle":"qa-1155cc7c24a7","displayName":"QA 1155cc7c24a7","password":"****","region":"eu"}

--- response: 201 in 58 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-1ae17ea4-d485-4089-b506-ffef1608690b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-1155cc7c24a7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_88720fc3-740f-497e-bd21-da9533e60b6d","handle":"qa-1155cc7c24a7","displayName":"QA 1155cc7c24a7","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.832446946Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-d6eb0926-8999-4e10-a0f6-94c9dff0a529

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6eb0926-8999-4e10-a0f6-94c9dff0a529
Content-Type: application/json

--- request body ---
{"handle":"qa-a15d7411accc","displayName":"QA a15d7411accc","password":"****","region":"eu"}

--- response: 201 in 11 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-d6eb0926-8999-4e10-a0f6-94c9dff0a529
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 552
RateLimit-Reset: 10
Location: /v1/accounts/qa-a15d7411accc
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e75baeb3-5960-4bdb-9b2f-4e267b459011","handle":"qa-a15d7411accc","displayName":"QA a15d7411accc","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.871783435Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-aa97af1a-7f06-40da-a4d9-ec3280a6b9a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa97af1a-7f06-40da-a4d9-ec3280a6b9a6
Content-Type: application/json

--- request body ---
{"handle":"qa-3824dcba3388","displayName":"QA 3824dcba3388","password":"****","region":"eu"}

--- response: 201 in 63 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-aa97af1a-7f06-40da-a4d9-ec3280a6b9a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 539
RateLimit-Reset: 9
Location: /v1/accounts/qa-3824dcba3388
X-Served-Region: eu
Content-Length: 181

{"id":"acc_f42bc6f1-0c4a-41dc-82ba-419addd36d46","handle":"qa-3824dcba3388","displayName":"QA 3824dcba3388","region":"eu","role":"user","createdAt":"2026-10-24T07:25:01.948181058Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-abd02ea0-73e0-4741-9910-4ee2a433dc7a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abd02ea0-73e0-4741-9910-4ee2a433dc7a
Content-Type: application/json

--- request body ---
{"handle":"qa-1155cc7c24a7","password":"****"}

--- response: 200 in 19 ms ---
Date: Sat, 24 Oct 2026 07:25:01 GMT
Content-Type: application/json
X-Correlation-Id: qa-abd02ea0-73e0-4741-9910-4ee2a433dc7a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 534
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_88720fc3-740f-497e-bd21-da9533e60b6d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-84215e5e-2900-45dc-a2ac-5518eefca1d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-84215e5e-2900-45dc-a2ac-5518eefca1d7
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a15d7411accc","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-84215e5e-2900-45dc-a2ac-5518eefca1d7
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
Location: /v1/conversations/cnv_b8e7e8d8-b43c-43da-a9e9-a0aa513ab2a4
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_b8e7e8d8-b43c-43da-a9e9-a0aa513ab2a4","subject":"Error contract","status":"open","region":"eu","participants":["qa-1155cc7c24a7","qa-a15d7411accc"],"messageCount":1,"unreadCount":0,"createdAt":"2026-10-24T07:25:02.027883569Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-ee714d32-0e9e-4370-98e4-23c223535c45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee714d32-0e9e-4370-98e4-23c223535c45
Content-Type: application/json

--- request body ---
{"handle":"qa-3824dcba3388","password":"****"}

--- response: 200 in 9 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee714d32-0e9e-4370-98e4-23c223535c45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 526
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_f42bc6f1-0c4a-41dc-82ba-419addd36d46"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_b8e7e8d8-b43c-43da-a9e9-a0aa513ab2a4/messages
correlation: qa-a05c32b3-70a8-4cd4-8de9-afcdb9a20bd1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a05c32b3-70a8-4cd4-8de9-afcdb9a20bd1
Content-Type: application/json

--- response: 403 in 8 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a05c32b3-70a8-4cd4-8de9-afcdb9a20bd1
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
Content-Length: 294

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_b8e7e8d8-b43c-43da-a9e9-a0aa513ab2a4/messages","correlationId":"qa-a05c32b3-70a8-4cd4-8de9-afcdb9a20bd1"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-13167275-30ed-4595-9855-4fa7ede19a52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13167275-30ed-4595-9855-4fa7ede19a52
Content-Type: application/json

--- response: 204 in 36 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-13167275-30ed-4595-9855-4fa7ede19a52
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
correlation: qa-db16ef6f-5386-483c-b58e-4eb9ca3878ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db16ef6f-5386-483c-b58e-4eb9ca3878ed
Content-Type: application/json

--- request body ---
{"handle":"qa-3824dcba3388","password":"****"}

--- response: 401 in 21 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-db16ef6f-5386-483c-b58e-4eb9ca3878ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 508
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-db16ef6f-5386-483c-b58e-4eb9ca3878ed"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-5c28bb48-0b1e-43a5-a831-c51f9860ff0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5c28bb48-0b1e-43a5-a831-c51f9860ff0f
Content-Type: application/json

--- request body ---
{"handle":"qa-a15d7411accc","password":"****"}

--- response: 200 in 32 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-5c28bb48-0b1e-43a5-a831-c51f9860ff0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 503
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e75baeb3-5960-4bdb-9b2f-4e267b459011"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-e8eb24f8-3cd4-40a8-b29b-8d2a3690e30f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8eb24f8-3cd4-40a8-b29b-8d2a3690e30f
Content-Type: application/json

--- response: 204 in 28 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-e8eb24f8-3cd4-40a8-b29b-8d2a3690e30f
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
correlation: qa-f8bff442-5630-468c-bf65-749be7b1ea86

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f8bff442-5630-468c-bf65-749be7b1ea86
Content-Type: application/json

--- request body ---
{"handle":"qa-a15d7411accc","password":"****"}

--- response: 401 in 42 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f8bff442-5630-468c-bf65-749be7b1ea86
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 486
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f8bff442-5630-468c-bf65-749be7b1ea86"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-4b3ef11e-9f6c-459b-a6dc-42c601954e33

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b3ef11e-9f6c-459b-a6dc-42c601954e33
Content-Type: application/json

--- response: 204 in 42 ms ---
Date: Sat, 24 Oct 2026 07:25:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-4b3ef11e-9f6c-459b-a6dc-42c601954e33
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
correlation: qa-47c3877f-84c1-4091-b1b0-df10b8a9baf2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47c3877f-84c1-4091-b1b0-df10b8a9baf2
Content-Type: application/json

--- request body ---
{"handle":"qa-1155cc7c24a7","password":"****"}

--- response: 401 in 33 ms ---
Date: Sat, 24 Oct 2026 07:25:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47c3877f-84c1-4091-b1b0-df10b8a9baf2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 461
RateLimit-Reset: 8
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-47c3877f-84c1-4091-b1b0-df10b8a9baf2"}
```
