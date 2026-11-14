# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 423 | `qa-566dc65a-bd06-4853-a4dd-e223dc2ed659` |
| 2 | `POST /v1/auth/token` | 200 | 49 | `qa-c0acf390-48e7-4c9c-a285-0475e6438410` |
| 3 | `GET /v1/accounts/me` | 200 | 24 | `qa-b2e663e0-f0a5-4b3c-a6f6-5c6bd31fe5fa` |
| 4 | `GET /v1/accounts/me` | 200 | 27 | `qa-4090c86c-cb4b-444b-9cc9-4fcc94913a52` |
| 5 | `GET /v1/accounts/me` | 200 | 15 | `qa-c5b52a61-e0c7-4aca-8a73-cd216aa16ab9` |
| 6 | `GET /v1/accounts/me` | 200 | 18 | `qa-429d8285-ee0a-49c2-9e22-ada10bd84d0f` |
| 7 | `GET /v1/accounts/me` | 200 | 14 | `qa-91b7c652-a2f6-4813-a525-fd98173be1ee` |
| 8 | `GET /v1/accounts/me` | 200 | 21 | `qa-3eed272b-44be-403e-86cf-895d72be8cd2` |
| 9 | `GET /v1/accounts/me` | 200 | 8 | `qa-4923b380-65f2-4071-afa9-ed7d466fbc1a` |
| 10 | `GET /v1/accounts/me` | 200 | 15 | `qa-e223fbb1-611e-4fb6-9734-19134eb89e4f` |
| 11 | `GET /v1/accounts/me` | 200 | 13 | `qa-142a215e-6732-4624-b25f-b887178fc293` |
| 12 | `GET /v1/accounts/me` | 200 | 13 | `qa-2f44178c-dfe2-4ce0-baf3-619ede4d09c3` |
| 13 | `GET /v1/accounts/me` | 200 | 11 | `qa-458e7e45-1bc9-4574-bbe4-4369460b29cb` |
| 14 | `GET /v1/accounts/me` | 200 | 11 | `qa-b91ab9b9-933a-4edb-86a5-dfb2b483d319` |
| 15 | `GET /v1/accounts/me` | 200 | 17 | `qa-1f65dc2b-5f3a-467f-87d4-a401972408b4` |
| 16 | `GET /v1/accounts/me` | 200 | 11 | `qa-2cec68a5-a9ae-44c6-b89c-211ee83593af` |
| 17 | `GET /v1/accounts/me` | 200 | 7 | `qa-bdee6685-6fb7-4f92-b563-731a64b4cf2d` |
| 18 | `GET /v1/accounts/me` | 200 | 10 | `qa-f26f2743-aeb9-455e-ab94-f71c48baff46` |
| 19 | `GET /v1/accounts/me` | 200 | 7 | `qa-8408c269-71d0-4a42-8054-0169b034d116` |
| 20 | `GET /v1/accounts/me` | 200 | 15 | `qa-bc9f0c6b-4328-4594-9408-d1a6ba5dd1d7` |
| 21 | `GET /v1/accounts/me` | 200 | 17 | `qa-27193c36-ee71-42fd-ad52-ae4df396bc17` |
| 22 | `GET /v1/accounts/me` | 200 | 19 | `qa-bea34304-1720-4ac5-b350-6d852643f6fc` |
| 23 | `GET /v1/accounts/me` | 200 | 17 | `qa-d51b9c40-0f5a-4450-8023-2120aac0a83c` |
| 24 | `GET /v1/accounts/me` | 200 | 15 | `qa-512d01df-8af1-4be4-9468-517e29a84f30` |
| 25 | `GET /v1/accounts/me` | 200 | 12 | `qa-f49713d4-b396-40bf-9949-86827b9dfe4d` |
| 26 | `GET /v1/accounts/me` | 200 | 8 | `qa-6a888e93-ef78-4ff4-88ca-f5afded16fe0` |
| 27 | `GET /v1/accounts/me` | 200 | 6 | `qa-4385045c-dc34-47ae-acef-ec2f071451ea` |
| 28 | `GET /v1/accounts/me` | 200 | 6 | `qa-8080e16c-2ad8-4567-82ff-9e041cda5cde` |
| 29 | `GET /v1/accounts/me` | 200 | 10 | `qa-3973504b-270a-436b-b042-d33f551ea8ea` |
| 30 | `GET /v1/accounts/me` | 200 | 6 | `qa-8cd4d544-33d1-4b25-a20c-399fe48cc1d5` |
| 31 | `GET /v1/accounts/me` | 200 | 17 | `qa-17c6caea-bb25-4c84-bda9-ae2d8d74e52d` |
| 32 | `GET /v1/accounts/me` | 200 | 10 | `qa-177184e4-33fb-4cd8-9517-d40630333936` |
| 33 | `GET /v1/accounts/me` | 200 | 9 | `qa-0ac29725-fbd4-4b6e-9440-01811d22d008` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-e97c7980-a808-415c-aa61-260064537a0e` |
| 35 | `GET /v1/accounts/me` | 200 | 20 | `qa-a6f0ae3a-5abc-4ea0-bb15-eb38df34cf4b` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-b2a70eb2-34ca-47cb-9c45-df327dd02596` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-ab5b2162-4b51-42a7-9cbd-02f72f0fc582` |
| 38 | `GET /v1/accounts/me` | 200 | 7 | `qa-0f46044e-5e08-4954-8aa8-c7a01e1b7922` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-e8b0f04a-3c7f-4407-96f2-93e5eefb9664` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-24f49b52-4488-45ef-8bbf-c7a2c5a469e4` |
| 41 | `GET /v1/accounts/me` | 200 | 5 | `qa-111ce70e-2e01-43f2-8e54-8aac8ee5faed` |
| 42 | `GET /v1/accounts/me` | 200 | 6 | `qa-d5522791-b2ad-4712-8ca5-68f18de9ed4c` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-247bb30b-7a92-4f17-9a23-d0da01925124` |
| 44 | `GET /v1/accounts/me` | 200 | 6 | `qa-e1029d62-e99b-4b09-ba7a-99b0383848f1` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-60f52ba6-78e1-4f95-b9d5-272d41b45284` |
| 46 | `GET /v1/accounts/me` | 200 | 6 | `qa-3ee3493d-2078-4890-a9e9-4ed463f0d415` |
| 47 | `GET /v1/accounts/me` | 200 | 12 | `qa-ad9e5535-e09c-45dd-8966-b5c5e0506288` |
| 48 | `GET /v1/accounts/me` | 200 | 15 | `qa-da259625-56dc-4f4d-acb4-8daae699fe6b` |
| 49 | `GET /v1/accounts/me` | 200 | 7 | `qa-dbcd3906-7f1a-4d62-ac08-abf9c5bdfc23` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-1e9b94e9-5fc4-4265-ae93-9b14f4df5a9c` |
| 51 | `GET /v1/accounts/me` | 200 | 8 | `qa-a24301e8-c05c-4063-a670-5386568b36d9` |
| 52 | `GET /v1/accounts/me` | 200 | 5 | `qa-2d2362a0-5aa1-44de-8706-1cbe115c5f5c` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-69501aa6-456d-4d82-957a-21e7cfaa8b8b` |
| 54 | `GET /v1/accounts/me` | 200 | 5 | `qa-dfef31b4-2b05-4de8-a408-19d61ac529fd` |
| 55 | `GET /v1/accounts/me` | 200 | 7 | `qa-decdd83c-b697-4153-be42-d7b180dfe9bb` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-10ae5a4c-c301-4327-88dd-7996dee8ce4c` |
| 57 | `GET /v1/accounts/me` | 200 | 6 | `qa-486356c0-8856-42e0-bd70-6c6e14b52986` |
| 58 | `GET /v1/accounts/me` | 200 | 10 | `qa-4e6168b8-0307-4dbb-a046-5ad17491fd36` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-4b8a0d3f-5e5b-4dc5-a602-cab9864d7d51` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-e71a83a7-b047-433c-b37c-1537092c44b9` |
| 61 | `GET /v1/accounts/me` | 200 | 7 | `qa-daa9cbc2-9a63-47f0-aa82-2e5f9c00ae89` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-2c94fef8-bfe9-49d1-a60c-7dee505dfa39` |
| 63 | `GET /v1/accounts/me` | 429 | 5 | `qa-52bd280a-f623-46f6-9d90-0b1d74ae9675` |
| 64 | `GET /v1/accounts/me` | 429 | 4 | `qa-c86c0f96-2581-4b18-970b-46cb12e6e00d` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-ce622858-ca36-46ab-b678-c381abe00c1f` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-96f632b2-bc15-458f-9a2e-0ea0e0db6254` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-943311a4-eebb-4f5a-9983-6c21904e2c23` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-935736ee-ea54-4195-89fc-62ee9d3997c6` |
| 69 | `GET /v1/accounts/me` | 429 | 5 | `qa-7bc144cc-694c-4537-9269-a2668ea6a213` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-e7b2a6b9-9a4a-4f54-a470-91d722b2c03e` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-60f4cf93-8fe1-40dc-a30b-a93956cd1acb` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-198e5bd0-fa8b-41f5-8073-020d911146bb` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-e8fdb846-dfd2-4fa9-b0eb-9914b1c7519a` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-f59c15be-8e0e-42c0-bce9-f681c0c089b9` |
| 75 | `GET /v1/accounts/me` | 429 | 4 | `qa-042156a0-23b0-425c-816b-bc069f887414` |
| 76 | `GET /v1/accounts/me` | 429 | 7 | `qa-6fcc753a-232c-4a93-bf5d-5b369b08c481` |
| 77 | `GET /v1/accounts/me` | 429 | 4 | `qa-832dfd17-08dc-487d-83f3-7ea0a3c170ee` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-4314c806-359f-460c-9647-06456f781592` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-47d90aac-e787-4e76-98fc-e6215392aa75` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-81b53ac1-6a64-4ac7-beda-bfbec09bd05d` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-817d2518-34c9-4775-ab48-f650b9c54f8f` |
| 82 | `DELETE /v1/accounts/me` | 204 | 5 | `qa-aaa76744-55e3-4551-a97d-e0574f9f6067` |
| 83 | `POST /v1/auth/token` | 401 | 4 | `qa-26900c76-89b0-4836-84b2-b58453556011` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-566dc65a-bd06-4853-a4dd-e223dc2ed659

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-566dc65a-bd06-4853-a4dd-e223dc2ed659
Content-Type: application/json

--- request body ---
{"handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","password":"****","region":"eu"}

--- response: 201 in 423 ms ---
Date: Fri, 13 Nov 2026 09:42:05 GMT
Content-Type: application/json
X-Correlation-Id: qa-566dc65a-bd06-4853-a4dd-e223dc2ed659
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 596
RateLimit-Reset: 10
Location: /v1/accounts/qa-9d65ef27da3c
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-c0acf390-48e7-4c9c-a285-0475e6438410

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c0acf390-48e7-4c9c-a285-0475e6438410
Content-Type: application/json

--- request body ---
{"handle":"qa-9d65ef27da3c","password":"****"}

--- response: 200 in 49 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-c0acf390-48e7-4c9c-a285-0475e6438410
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 595
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2e663e0-f0a5-4b3c-a6f6-5c6bd31fe5fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2e663e0-f0a5-4b3c-a6f6-5c6bd31fe5fa
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2e663e0-f0a5-4b3c-a6f6-5c6bd31fe5fa
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
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-4090c86c-cb4b-444b-9cc9-4fcc94913a52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4090c86c-cb4b-444b-9cc9-4fcc94913a52
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4090c86c-cb4b-444b-9cc9-4fcc94913a52
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
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-c5b52a61-e0c7-4aca-8a73-cd216aa16ab9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c5b52a61-e0c7-4aca-8a73-cd216aa16ab9
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-c5b52a61-e0c7-4aca-8a73-cd216aa16ab9
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
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-429d8285-ee0a-49c2-9e22-ada10bd84d0f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-429d8285-ee0a-49c2-9e22-ada10bd84d0f
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-429d8285-ee0a-49c2-9e22-ada10bd84d0f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-91b7c652-a2f6-4813-a525-fd98173be1ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91b7c652-a2f6-4813-a525-fd98173be1ee
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-91b7c652-a2f6-4813-a525-fd98173be1ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-3eed272b-44be-403e-86cf-895d72be8cd2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3eed272b-44be-403e-86cf-895d72be8cd2
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3eed272b-44be-403e-86cf-895d72be8cd2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-4923b380-65f2-4071-afa9-ed7d466fbc1a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4923b380-65f2-4071-afa9-ed7d466fbc1a
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4923b380-65f2-4071-afa9-ed7d466fbc1a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-e223fbb1-611e-4fb6-9734-19134eb89e4f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e223fbb1-611e-4fb6-9734-19134eb89e4f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e223fbb1-611e-4fb6-9734-19134eb89e4f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-142a215e-6732-4624-b25f-b887178fc293

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-142a215e-6732-4624-b25f-b887178fc293
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-142a215e-6732-4624-b25f-b887178fc293
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f44178c-dfe2-4ce0-baf3-619ede4d09c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f44178c-dfe2-4ce0-baf3-619ede4d09c3
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f44178c-dfe2-4ce0-baf3-619ede4d09c3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-458e7e45-1bc9-4574-bbe4-4369460b29cb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-458e7e45-1bc9-4574-bbe4-4369460b29cb
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-458e7e45-1bc9-4574-bbe4-4369460b29cb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-b91ab9b9-933a-4edb-86a5-dfb2b483d319

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b91ab9b9-933a-4edb-86a5-dfb2b483d319
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b91ab9b9-933a-4edb-86a5-dfb2b483d319
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f65dc2b-5f3a-467f-87d4-a401972408b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f65dc2b-5f3a-467f-87d4-a401972408b4
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f65dc2b-5f3a-467f-87d4-a401972408b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cec68a5-a9ae-44c6-b89c-211ee83593af

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cec68a5-a9ae-44c6-b89c-211ee83593af
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2cec68a5-a9ae-44c6-b89c-211ee83593af
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-bdee6685-6fb7-4f92-b563-731a64b4cf2d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bdee6685-6fb7-4f92-b563-731a64b4cf2d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bdee6685-6fb7-4f92-b563-731a64b4cf2d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-f26f2743-aeb9-455e-ab94-f71c48baff46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f26f2743-aeb9-455e-ab94-f71c48baff46
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f26f2743-aeb9-455e-ab94-f71c48baff46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-8408c269-71d0-4a42-8054-0169b034d116

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8408c269-71d0-4a42-8054-0169b034d116
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8408c269-71d0-4a42-8054-0169b034d116
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-bc9f0c6b-4328-4594-9408-d1a6ba5dd1d7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bc9f0c6b-4328-4594-9408-d1a6ba5dd1d7
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bc9f0c6b-4328-4594-9408-d1a6ba5dd1d7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-27193c36-ee71-42fd-ad52-ae4df396bc17

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-27193c36-ee71-42fd-ad52-ae4df396bc17
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-27193c36-ee71-42fd-ad52-ae4df396bc17
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-bea34304-1720-4ac5-b350-6d852643f6fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bea34304-1720-4ac5-b350-6d852643f6fc
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-bea34304-1720-4ac5-b350-6d852643f6fc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-d51b9c40-0f5a-4450-8023-2120aac0a83c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d51b9c40-0f5a-4450-8023-2120aac0a83c
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-d51b9c40-0f5a-4450-8023-2120aac0a83c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-512d01df-8af1-4be4-9468-517e29a84f30

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512d01df-8af1-4be4-9468-517e29a84f30
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-512d01df-8af1-4be4-9468-517e29a84f30
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-f49713d4-b396-40bf-9949-86827b9dfe4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f49713d4-b396-40bf-9949-86827b9dfe4d
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f49713d4-b396-40bf-9949-86827b9dfe4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-6a888e93-ef78-4ff4-88ca-f5afded16fe0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6a888e93-ef78-4ff4-88ca-f5afded16fe0
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-6a888e93-ef78-4ff4-88ca-f5afded16fe0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-4385045c-dc34-47ae-acef-ec2f071451ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4385045c-dc34-47ae-acef-ec2f071451ea
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4385045c-dc34-47ae-acef-ec2f071451ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-8080e16c-2ad8-4567-82ff-9e041cda5cde

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8080e16c-2ad8-4567-82ff-9e041cda5cde
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8080e16c-2ad8-4567-82ff-9e041cda5cde
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-3973504b-270a-436b-b042-d33f551ea8ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3973504b-270a-436b-b042-d33f551ea8ea
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-3973504b-270a-436b-b042-d33f551ea8ea
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-8cd4d544-33d1-4b25-a20c-399fe48cc1d5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cd4d544-33d1-4b25-a20c-399fe48cc1d5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-8cd4d544-33d1-4b25-a20c-399fe48cc1d5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-17c6caea-bb25-4c84-bda9-ae2d8d74e52d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17c6caea-bb25-4c84-bda9-ae2d8d74e52d
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-17c6caea-bb25-4c84-bda9-ae2d8d74e52d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-177184e4-33fb-4cd8-9517-d40630333936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-177184e4-33fb-4cd8-9517-d40630333936
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-177184e4-33fb-4cd8-9517-d40630333936
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-0ac29725-fbd4-4b6e-9440-01811d22d008

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0ac29725-fbd4-4b6e-9440-01811d22d008
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-0ac29725-fbd4-4b6e-9440-01811d22d008
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-e97c7980-a808-415c-aa61-260064537a0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e97c7980-a808-415c-aa61-260064537a0e
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e97c7980-a808-415c-aa61-260064537a0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-a6f0ae3a-5abc-4ea0-bb15-eb38df34cf4b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a6f0ae3a-5abc-4ea0-bb15-eb38df34cf4b
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-a6f0ae3a-5abc-4ea0-bb15-eb38df34cf4b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2a70eb2-34ca-47cb-9c45-df327dd02596

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2a70eb2-34ca-47cb-9c45-df327dd02596
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2a70eb2-34ca-47cb-9c45-df327dd02596
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab5b2162-4b51-42a7-9cbd-02f72f0fc582

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab5b2162-4b51-42a7-9cbd-02f72f0fc582
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab5b2162-4b51-42a7-9cbd-02f72f0fc582
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-0f46044e-5e08-4954-8aa8-c7a01e1b7922

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f46044e-5e08-4954-8aa8-c7a01e1b7922
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f46044e-5e08-4954-8aa8-c7a01e1b7922
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8b0f04a-3c7f-4407-96f2-93e5eefb9664

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8b0f04a-3c7f-4407-96f2-93e5eefb9664
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8b0f04a-3c7f-4407-96f2-93e5eefb9664
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-24f49b52-4488-45ef-8bbf-c7a2c5a469e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24f49b52-4488-45ef-8bbf-c7a2c5a469e4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-24f49b52-4488-45ef-8bbf-c7a2c5a469e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-111ce70e-2e01-43f2-8e54-8aac8ee5faed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-111ce70e-2e01-43f2-8e54-8aac8ee5faed
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-111ce70e-2e01-43f2-8e54-8aac8ee5faed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5522791-b2ad-4712-8ca5-68f18de9ed4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5522791-b2ad-4712-8ca5-68f18de9ed4c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5522791-b2ad-4712-8ca5-68f18de9ed4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-247bb30b-7a92-4f17-9a23-d0da01925124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-247bb30b-7a92-4f17-9a23-d0da01925124
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-247bb30b-7a92-4f17-9a23-d0da01925124
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1029d62-e99b-4b09-ba7a-99b0383848f1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1029d62-e99b-4b09-ba7a-99b0383848f1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e1029d62-e99b-4b09-ba7a-99b0383848f1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-60f52ba6-78e1-4f95-b9d5-272d41b45284

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60f52ba6-78e1-4f95-b9d5-272d41b45284
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-60f52ba6-78e1-4f95-b9d5-272d41b45284
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ee3493d-2078-4890-a9e9-4ed463f0d415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ee3493d-2078-4890-a9e9-4ed463f0d415
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ee3493d-2078-4890-a9e9-4ed463f0d415
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-ad9e5535-e09c-45dd-8966-b5c5e0506288

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad9e5535-e09c-45dd-8966-b5c5e0506288
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-ad9e5535-e09c-45dd-8966-b5c5e0506288
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-da259625-56dc-4f4d-acb4-8daae699fe6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-da259625-56dc-4f4d-acb4-8daae699fe6b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-da259625-56dc-4f4d-acb4-8daae699fe6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-dbcd3906-7f1a-4d62-ac08-abf9c5bdfc23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dbcd3906-7f1a-4d62-ac08-abf9c5bdfc23
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-dbcd3906-7f1a-4d62-ac08-abf9c5bdfc23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-1e9b94e9-5fc4-4265-ae93-9b14f4df5a9c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1e9b94e9-5fc4-4265-ae93-9b14f4df5a9c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-1e9b94e9-5fc4-4265-ae93-9b14f4df5a9c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-a24301e8-c05c-4063-a670-5386568b36d9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a24301e8-c05c-4063-a670-5386568b36d9
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-a24301e8-c05c-4063-a670-5386568b36d9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d2362a0-5aa1-44de-8706-1cbe115c5f5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d2362a0-5aa1-44de-8706-1cbe115c5f5c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d2362a0-5aa1-44de-8706-1cbe115c5f5c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-69501aa6-456d-4d82-957a-21e7cfaa8b8b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-69501aa6-456d-4d82-957a-21e7cfaa8b8b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-69501aa6-456d-4d82-957a-21e7cfaa8b8b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfef31b4-2b05-4de8-a408-19d61ac529fd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfef31b4-2b05-4de8-a408-19d61ac529fd
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfef31b4-2b05-4de8-a408-19d61ac529fd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-decdd83c-b697-4153-be42-d7b180dfe9bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-decdd83c-b697-4153-be42-d7b180dfe9bb
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-decdd83c-b697-4153-be42-d7b180dfe9bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-10ae5a4c-c301-4327-88dd-7996dee8ce4c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10ae5a4c-c301-4327-88dd-7996dee8ce4c
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-10ae5a4c-c301-4327-88dd-7996dee8ce4c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-486356c0-8856-42e0-bd70-6c6e14b52986

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-486356c0-8856-42e0-bd70-6c6e14b52986
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-486356c0-8856-42e0-bd70-6c6e14b52986
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-4e6168b8-0307-4dbb-a046-5ad17491fd36

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4e6168b8-0307-4dbb-a046-5ad17491fd36
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4e6168b8-0307-4dbb-a046-5ad17491fd36
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b8a0d3f-5e5b-4dc5-a602-cab9864d7d51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b8a0d3f-5e5b-4dc5-a602-cab9864d7d51
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b8a0d3f-5e5b-4dc5-a602-cab9864d7d51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-e71a83a7-b047-433c-b37c-1537092c44b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e71a83a7-b047-433c-b37c-1537092c44b9
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-e71a83a7-b047-433c-b37c-1537092c44b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-daa9cbc2-9a63-47f0-aa82-2e5f9c00ae89

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-daa9cbc2-9a63-47f0-aa82-2e5f9c00ae89
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-daa9cbc2-9a63-47f0-aa82-2e5f9c00ae89
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c94fef8-bfe9-49d1-a60c-7dee505dfa39

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c94fef8-bfe9-49d1-a60c-7dee505dfa39
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c94fef8-bfe9-49d1-a60c-7dee505dfa39
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-52bd280a-f623-46f6-9d90-0b1d74ae9675

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52bd280a-f623-46f6-9d90-0b1d74ae9675
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-52bd280a-f623-46f6-9d90-0b1d74ae9675
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-52bd280a-f623-46f6-9d90-0b1d74ae9675"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-c86c0f96-2581-4b18-970b-46cb12e6e00d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c86c0f96-2581-4b18-970b-46cb12e6e00d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c86c0f96-2581-4b18-970b-46cb12e6e00d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c86c0f96-2581-4b18-970b-46cb12e6e00d"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce622858-ca36-46ab-b678-c381abe00c1f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce622858-ca36-46ab-b678-c381abe00c1f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce622858-ca36-46ab-b678-c381abe00c1f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ce622858-ca36-46ab-b678-c381abe00c1f"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-96f632b2-bc15-458f-9a2e-0ea0e0db6254

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-96f632b2-bc15-458f-9a2e-0ea0e0db6254
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:08 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-96f632b2-bc15-458f-9a2e-0ea0e0db6254
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-96f632b2-bc15-458f-9a2e-0ea0e0db6254"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-943311a4-eebb-4f5a-9983-6c21904e2c23

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-943311a4-eebb-4f5a-9983-6c21904e2c23
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-943311a4-eebb-4f5a-9983-6c21904e2c23
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-943311a4-eebb-4f5a-9983-6c21904e2c23"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-935736ee-ea54-4195-89fc-62ee9d3997c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-935736ee-ea54-4195-89fc-62ee9d3997c6
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:09 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-935736ee-ea54-4195-89fc-62ee9d3997c6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-935736ee-ea54-4195-89fc-62ee9d3997c6"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bc144cc-694c-4537-9269-a2668ea6a213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bc144cc-694c-4537-9269-a2668ea6a213
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bc144cc-694c-4537-9269-a2668ea6a213
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7bc144cc-694c-4537-9269-a2668ea6a213"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-e7b2a6b9-9a4a-4f54-a470-91d722b2c03e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e7b2a6b9-9a4a-4f54-a470-91d722b2c03e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e7b2a6b9-9a4a-4f54-a470-91d722b2c03e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e7b2a6b9-9a4a-4f54-a470-91d722b2c03e"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-60f4cf93-8fe1-40dc-a30b-a93956cd1acb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-60f4cf93-8fe1-40dc-a30b-a93956cd1acb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-60f4cf93-8fe1-40dc-a30b-a93956cd1acb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-60f4cf93-8fe1-40dc-a30b-a93956cd1acb"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-198e5bd0-fa8b-41f5-8073-020d911146bb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-198e5bd0-fa8b-41f5-8073-020d911146bb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:11 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-198e5bd0-fa8b-41f5-8073-020d911146bb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-198e5bd0-fa8b-41f5-8073-020d911146bb"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8fdb846-dfd2-4fa9-b0eb-9914b1c7519a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8fdb846-dfd2-4fa9-b0eb-9914b1c7519a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e8fdb846-dfd2-4fa9-b0eb-9914b1c7519a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e8fdb846-dfd2-4fa9-b0eb-9914b1c7519a"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-f59c15be-8e0e-42c0-bce9-f681c0c089b9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f59c15be-8e0e-42c0-bce9-f681c0c089b9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:12 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f59c15be-8e0e-42c0-bce9-f681c0c089b9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f59c15be-8e0e-42c0-bce9-f681c0c089b9"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-042156a0-23b0-425c-816b-bc069f887414

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-042156a0-23b0-425c-816b-bc069f887414
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-042156a0-23b0-425c-816b-bc069f887414
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-042156a0-23b0-425c-816b-bc069f887414"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-6fcc753a-232c-4a93-bf5d-5b369b08c481

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fcc753a-232c-4a93-bf5d-5b369b08c481
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 13 Nov 2026 09:42:13 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6fcc753a-232c-4a93-bf5d-5b369b08c481
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6fcc753a-232c-4a93-bf5d-5b369b08c481"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-832dfd17-08dc-487d-83f3-7ea0a3c170ee

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-832dfd17-08dc-487d-83f3-7ea0a3c170ee
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-832dfd17-08dc-487d-83f3-7ea0a3c170ee
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-832dfd17-08dc-487d-83f3-7ea0a3c170ee"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-4314c806-359f-460c-9647-06456f781592

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4314c806-359f-460c-9647-06456f781592
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:14 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4314c806-359f-460c-9647-06456f781592
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4314c806-359f-460c-9647-06456f781592"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-47d90aac-e787-4e76-98fc-e6215392aa75

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47d90aac-e787-4e76-98fc-e6215392aa75
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:15 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-47d90aac-e787-4e76-98fc-e6215392aa75
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-47d90aac-e787-4e76-98fc-e6215392aa75"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-81b53ac1-6a64-4ac7-beda-bfbec09bd05d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-81b53ac1-6a64-4ac7-beda-bfbec09bd05d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-81b53ac1-6a64-4ac7-beda-bfbec09bd05d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-81b53ac1-6a64-4ac7-beda-bfbec09bd05d"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-817d2518-34c9-4775-ab48-f650b9c54f8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-817d2518-34c9-4775-ab48-f650b9c54f8f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:16 GMT
Content-Type: application/json
X-Correlation-Id: qa-817d2518-34c9-4775-ab48-f650b9c54f8f
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
Content-Length: 181

{"id":"acc_e73f0154-d6e0-4636-b2d3-7da45d88156c","handle":"qa-9d65ef27da3c","displayName":"QA 9d65ef27da3c","region":"eu","role":"user","createdAt":"2026-11-13T09:42:05.657781526Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-aaa76744-55e3-4551-a97d-e0574f9f6067

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aaa76744-55e3-4551-a97d-e0574f9f6067
Content-Type: application/json

--- response: 204 in 5 ms ---
Date: Fri, 13 Nov 2026 09:42:16 GMT
Content-Type: text/plain
X-Correlation-Id: qa-aaa76744-55e3-4551-a97d-e0574f9f6067
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-26900c76-89b0-4836-84b2-b58453556011

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26900c76-89b0-4836-84b2-b58453556011
Content-Type: application/json

--- request body ---
{"handle":"qa-9d65ef27da3c","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 13 Nov 2026 09:42:16 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-26900c76-89b0-4836-84b2-b58453556011
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-26900c76-89b0-4836-84b2-b58453556011"}
```
