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
| 1 | `POST /v1/accounts` | 201 | 386 | `qa-4441d8f2-ec0e-486d-abb1-7b9ef6efa621` |
| 2 | `POST /v1/accounts` | 201 | 46 | `qa-f6284047-5a08-4df7-a438-a5a31afbf666` |
| 3 | `POST /v1/accounts` | 201 | 29 | `qa-a391b160-2e77-4ce8-8bcf-3e4ac921193f` |
| 4 | `POST /v1/auth/token` | 200 | 31 | `qa-c3a70997-4f48-4f81-99a2-1735f4823dce` |
| 5 | `POST /v1/conversations` | 201 | 51 | `qa-55269253-93b4-4aa1-932c-a7ca0df58992` |
| 6 | `POST /v1/auth/token` | 200 | 28 | `qa-91714b94-9f72-4ba0-b10a-e9cda2a65a6b` |
| 7 | `GET /v1/conversations/{id}/messages` | 403 | 35 | `qa-a1f6079e-dd79-4f5a-9360-875756e61c5c` |
| 8 | `DELETE /v1/accounts/me` | 204 | 25 | `qa-02395082-5e85-45b4-8e73-ab58b6e409e5` |
| 9 | `POST /v1/auth/token` | 401 | 9 | `qa-136c2b25-5e98-4c77-8980-3b83f2c26667` |
| 10 | `POST /v1/auth/token` | 200 | 32 | `qa-038ecbb8-1f68-4804-bf96-110b2e58d7a2` |
| 11 | `DELETE /v1/accounts/me` | 204 | 15 | `qa-eb02bbac-23a7-41dc-9b3a-6f4302798c1b` |
| 12 | `POST /v1/auth/token` | 401 | 11 | `qa-f5d1b1b6-73e5-48bb-aacf-7756ed02e3b2` |
| 13 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-f1728669-0e91-4373-8925-ca60361aba4e` |
| 14 | `POST /v1/auth/token` | 401 | 15 | `qa-d274d79d-b1f8-494c-b380-bd7d2acc6596` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-4441d8f2-ec0e-486d-abb1-7b9ef6efa621

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4441d8f2-ec0e-486d-abb1-7b9ef6efa621
Content-Type: application/json

--- request body ---
{"handle":"qa-58b5d2999ed7","displayName":"QA 58b5d2999ed7","password":"****","region":"eu"}

--- response: 201 in 386 ms ---
Date: Tue, 03 Nov 2026 09:41:30 GMT
Content-Type: application/json
X-Correlation-Id: qa-4441d8f2-ec0e-486d-abb1-7b9ef6efa621
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 11
Location: /v1/accounts/qa-58b5d2999ed7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_34219fa9-579d-4670-9dcb-6a555d95be8d","handle":"qa-58b5d2999ed7","displayName":"QA 58b5d2999ed7","region":"eu","role":"user","createdAt":"2026-11-03T09:41:30.891161889Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-f6284047-5a08-4df7-a438-a5a31afbf666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f6284047-5a08-4df7-a438-a5a31afbf666
Content-Type: application/json

--- request body ---
{"handle":"qa-a60055abd3c2","displayName":"QA a60055abd3c2","password":"****","region":"eu"}

--- response: 201 in 46 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-f6284047-5a08-4df7-a438-a5a31afbf666
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 575
RateLimit-Reset: 10
Location: /v1/accounts/qa-a60055abd3c2
X-Served-Region: eu
Content-Length: 181

{"id":"acc_439b98d9-e77e-4a75-9a79-607cae0c0fc8","handle":"qa-a60055abd3c2","displayName":"QA a60055abd3c2","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.235807142Z"}
```

## 3. POST /v1/accounts

```text
#3 POST http://localhost:7070/v1/accounts
correlation: qa-a391b160-2e77-4ce8-8bcf-3e4ac921193f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a391b160-2e77-4ce8-8bcf-3e4ac921193f
Content-Type: application/json

--- request body ---
{"handle":"qa-c9bb85da7bc5","displayName":"QA c9bb85da7bc5","password":"****","region":"eu"}

--- response: 201 in 29 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-a391b160-2e77-4ce8-8bcf-3e4ac921193f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 571
RateLimit-Reset: 10
Location: /v1/accounts/qa-c9bb85da7bc5
X-Served-Region: eu
Content-Length: 181

{"id":"acc_80f83cce-7acc-4ee8-bef7-cb9dc0a129d4","handle":"qa-c9bb85da7bc5","displayName":"QA c9bb85da7bc5","region":"eu","role":"user","createdAt":"2026-11-03T09:41:31.278718198Z"}
```

## 4. POST /v1/auth/token

```text
#4 POST http://localhost:7070/v1/auth/token
correlation: qa-c3a70997-4f48-4f81-99a2-1735f4823dce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c3a70997-4f48-4f81-99a2-1735f4823dce
Content-Type: application/json

--- request body ---
{"handle":"qa-58b5d2999ed7","password":"****"}

--- response: 200 in 31 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-c3a70997-4f48-4f81-99a2-1735f4823dce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 558
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_34219fa9-579d-4670-9dcb-6a555d95be8d"}
```

## 5. POST /v1/conversations

```text
#5 POST http://localhost:7070/v1/conversations
correlation: qa-55269253-93b4-4aa1-932c-a7ca0df58992

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55269253-93b4-4aa1-932c-a7ca0df58992
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-a60055abd3c2","subject":"Error contract","message":"Hi"}

--- response: 201 in 51 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-55269253-93b4-4aa1-932c-a7ca0df58992
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
Location: /v1/conversations/cnv_89703b3b-6c9f-4fad-a7b2-3457f44b50d2
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_89703b3b-6c9f-4fad-a7b2-3457f44b50d2","subject":"Error contract","status":"open","region":"eu","participants":["qa-58b5d2999ed7","qa-a60055abd3c2"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-03T09:41:31.396922925Z"}
```

## 6. POST /v1/auth/token

```text
#6 POST http://localhost:7070/v1/auth/token
correlation: qa-91714b94-9f72-4ba0-b10a-e9cda2a65a6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91714b94-9f72-4ba0-b10a-e9cda2a65a6b
Content-Type: application/json

--- request body ---
{"handle":"qa-c9bb85da7bc5","password":"****"}

--- response: 200 in 28 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/json
X-Correlation-Id: qa-91714b94-9f72-4ba0-b10a-e9cda2a65a6b
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_80f83cce-7acc-4ee8-bef7-cb9dc0a129d4"}
```

## 7. GET /v1/conversations/{id}/messages

```text
#7 GET http://localhost:7070/v1/conversations/cnv_89703b3b-6c9f-4fad-a7b2-3457f44b50d2/messages
correlation: qa-a1f6079e-dd79-4f5a-9360-875756e61c5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1f6079e-dd79-4f5a-9360-875756e61c5c
Content-Type: application/json

--- response: 403 in 35 ms ---
Date: Tue, 03 Nov 2026 09:41:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a1f6079e-dd79-4f5a-9360-875756e61c5c
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

{"type":"https://reference-service.example/problems/forbidden","title":"Forbidden","status":403,"detail":"You are not a participant in this conversation.","instance":"/v1/conversations/cnv_89703b3b-6c9f-4fad-a7b2-3457f44b50d2/messages","correlationId":"qa-a1f6079e-dd79-4f5a-9360-875756e61c5c"}
```

## 8. DELETE /v1/accounts/me

```text
#8 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-02395082-5e85-45b4-8e73-ab58b6e409e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-02395082-5e85-45b4-8e73-ab58b6e409e5
Content-Type: application/json

--- response: 204 in 25 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-02395082-5e85-45b4-8e73-ab58b6e409e5
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
correlation: qa-136c2b25-5e98-4c77-8980-3b83f2c26667

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-136c2b25-5e98-4c77-8980-3b83f2c26667
Content-Type: application/json

--- request body ---
{"handle":"qa-c9bb85da7bc5","password":"****"}

--- response: 401 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-136c2b25-5e98-4c77-8980-3b83f2c26667
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
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-136c2b25-5e98-4c77-8980-3b83f2c26667"}
```

## 10. POST /v1/auth/token

```text
#10 POST http://localhost:7070/v1/auth/token
correlation: qa-038ecbb8-1f68-4804-bf96-110b2e58d7a2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-038ecbb8-1f68-4804-bf96-110b2e58d7a2
Content-Type: application/json

--- request body ---
{"handle":"qa-a60055abd3c2","password":"****"}

--- response: 200 in 32 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/json
X-Correlation-Id: qa-038ecbb8-1f68-4804-bf96-110b2e58d7a2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 524
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_439b98d9-e77e-4a75-9a79-607cae0c0fc8"}
```

## 11. DELETE /v1/accounts/me

```text
#11 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-eb02bbac-23a7-41dc-9b3a-6f4302798c1b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb02bbac-23a7-41dc-9b3a-6f4302798c1b
Content-Type: application/json

--- response: 204 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-eb02bbac-23a7-41dc-9b3a-6f4302798c1b
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
correlation: qa-f5d1b1b6-73e5-48bb-aacf-7756ed02e3b2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5d1b1b6-73e5-48bb-aacf-7756ed02e3b2
Content-Type: application/json

--- request body ---
{"handle":"qa-a60055abd3c2","password":"****"}

--- response: 401 in 11 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f5d1b1b6-73e5-48bb-aacf-7756ed02e3b2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 516
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-f5d1b1b6-73e5-48bb-aacf-7756ed02e3b2"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-f1728669-0e91-4373-8925-ca60361aba4e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f1728669-0e91-4373-8925-ca60361aba4e
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: text/plain
X-Correlation-Id: qa-f1728669-0e91-4373-8925-ca60361aba4e
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
correlation: qa-d274d79d-b1f8-494c-b380-bd7d2acc6596

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d274d79d-b1f8-494c-b380-bd7d2acc6596
Content-Type: application/json

--- request body ---
{"handle":"qa-58b5d2999ed7","password":"****"}

--- response: 401 in 15 ms ---
Date: Tue, 03 Nov 2026 09:41:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d274d79d-b1f8-494c-b380-bd7d2acc6596
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 510
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-d274d79d-b1f8-494c-b380-bd7d2acc6596"}
```
